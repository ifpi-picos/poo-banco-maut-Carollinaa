public class ContaPoupanca extends Conta {

    private double rendimento;

     public ContaPoupanca(int numAgencia, int numConta) {
         super(numAgencia, numConta);
     }

    public boolean deposita(double valor){
         return super.depositar(valor);

  }
    
    public String sacar(double valor){
        return super.sacar(valor);

    }
     
}
