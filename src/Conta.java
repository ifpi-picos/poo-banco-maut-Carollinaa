import java.util.ArrayList;
import java.util.List;

class Conta {

    private int numAgencia;
    private int numConta;
    private double saldo = 0.00;
    private List<String> historico = new ArrayList<>();

    public Conta(int numAgencia, int numConta) {
        this.numAgencia = numAgencia;
        this.numConta = numConta;
    }
    public String depositar(double valor){
        if(valor > 0){
            this.saldo = saldo + valor;
            this.historico.add("Deposito realizado de "+ String.format("%.2f", valor) + " R$ na conta " + this.numConta + " saldo: " + String.format("%.2f", this.saldo)+" R$");
            return "Deposito bem sucedido!";
        }else{
            return "O valor do depósito não pode ser igual a 0 e não pode ser negativo";
        }
    }
    public String sacar(double valor){
        if(this.saldo >= valor){
            this.saldo = saldo - valor;
            this.historico.add("Saque realizado de "+ String.format("%.2f", valor) + " R$ na conta " + this.numConta + " saldo: " + String.format("%.2f", this.saldo)+" R$");
            return "Saque bem sucedido!";
        }else{
            return "Saldo insuficiente para realizar o saque!";
        }  
    }

    public String transferirParaOutraConta(double valor, Conta conta){
        if(this.saldo >= valor){
            this.saldo -= valor;
            conta.setSaldo(valor);
            this.historico.add("Transferência realizada de "+ String.format("%.2f", valor) + " R$ da conta " + this.numConta + " para a conta " + conta.getNunConta() + " saldo: " + String.format("%.2f", this.saldo)+" R$");
            return "Tranferencia bem sucedida!";
        }else{
            return "Saldo insuficiente para realizar a transferencia!";
        }
    } 
    
    public void exibirExtrato(){
        for(int i = 0; i < historico.size(); i++){
            System.out.println(historico.get(i));
        }
    }

    private int getNunConta() {
        return this.numConta;
    }

    public String getSaldo() {
        return "Saldo da conta " + this.numConta + " : " + String.format("%.2f", this.saldo)+" R$";
    }

    // atribuir valor a variavel privada saldo.
    public void setSaldo(double saldo) {
         this.saldo += saldo;
    }
}
