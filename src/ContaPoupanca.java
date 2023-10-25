public class ContaPoupanca extends Conta {

    private double rendimento;

     public ContaPoupanca(int numAgencia, int numConta, double rendimento) {
         super(numAgencia, numConta);
         this.rendimento = rendimento;
     }

     @Override
    public boolean depositar(double valor){
         return super.depositar(valor);

  }
    @Override
    public String sacar(double valor){
        return super.sacar(valor)+" - Conta poupança";

    }
     
    public double getRendimento(){
        return rendimento;
    }
}
