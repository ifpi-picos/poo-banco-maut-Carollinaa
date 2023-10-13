public class Cliente {

    private static String nome;
    private static String cpf;
    private static String endereco;

    public static void main(String[] args){
       
        Conta conta1 = new Conta(123,111111);
        Conta conta2 = new Conta(545,222222);

        System.out.println(conta1.depositar(100.00));
        System.out.println(conta1.depositar(10.00));
        System.out.println(conta1.depositar(500.00));
        System.out.println(conta1.sacar(50.00));

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta1.transferirParaOutraConta(50.00, conta2));
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

        conta1.exibirExtrato();
    }
}
