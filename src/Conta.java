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
    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo = saldo + valor;
            this.historico.add("Deposito realizado de "+ String.format("%.2f", valor) + " R$ na conta " + this.numConta + " saldo: " + String.format("%.2f", this.saldo)+" R$");
            this.enviaNotificacao("deposito", valor);
            return true;
        }else{
            return false;
        }
    }
    public String sacar(double valor){
        if(this.saldo >= valor){
            this.saldo = saldo - valor;
            this.historico.add("Saque realizado de "+ String.format("%.2f", valor) + " R$ na conta " + this.numConta + " saldo: " + String.format("%.2f", this.saldo)+" R$");
            this.enviaNotificacao("sacar", valor);
            return "Saque bem sucedido!";
        }else{
            return "Saldo insuficiente para realizar o saque!";
        }  
    }

    public String transferirParaOutraConta(double valor, String string){
        if(this.saldo >= valor){
            this.saldo -= valor;
            string.setSaldo(valor);
            this.historico.add("Transferência realizada de "+ String.format("%.2f", valor) + " R$ da conta " + this.numConta + " para a conta " + string.getNunConta() + " saldo: " + String.format("%.2f", this.saldo)+" R$");
            this.enviaNotificacao("transferencia", valor);
            return "Tranferencia bem sucedida!";
        }else{
            return "Saldo insuficiente para realizar a transferencia!";
        }
    } 

    public void enviaNotificacao(String tipo, double valor){
        Notificacao sms = new Sms();
        Notificacao email = new Email();
        sms.enviarNotificacao(tipo, valor);
        email.enviarNotificacao(tipo, valor);
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

    public void setSaldo(double saldo) {
         this.saldo += saldo;
    }

    public int getNunAgencia(){
        return numAgencia;
    }

}
