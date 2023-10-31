public class Cliente {

    private String nome;
    private String cpf;
    private String dataDeNascimento;

    // endereço não está sendo usado, mas deveria
    public Cliente(String nome, String cpf, String dataDeNascimento, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    // método main não deveria estar nessa classe
    public static void main(String[] args) {

        Endereco fixo = new Endereco("Rua das oliveiras", 234, "Centro", "São Maria", "Piauí");

        new Cliente("Carol", "000000000", "12/03/2004", fixo);


        Conta contaPoupanca = new ContaPoupanca(123, 111111, 3.5);
        Conta contaCorente = new ContaCorente(545, 22222, 7000);

        System.out.println(contaPoupanca.depositar(100.00));
        System.out.println(contaPoupanca.depositar(10.00));
        System.out.println(contaPoupanca.depositar(500.00));
        System.out.println(contaPoupanca.sacar(50.00));

        System.out.println(contaPoupanca.getSaldo());
        System.out.println(contaCorente.getSaldo());
        System.out.println(contaPoupanca.transferirParaOutraConta(50.00, contaCorente));
        System.out.println(contaPoupanca.getSaldo());
        System.out.println(contaCorente.getSaldo());

        contaPoupanca.exibirExtrato();

    }
}
