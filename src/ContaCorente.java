public class ContaCorente extends Conta{

    private double chequeEspecial;


    public ContaCorente(int numAgencia, int numConta, double chequeEspecial) {
        super(numAgencia, numConta);
        this.chequeEspecial = chequeEspecial;
    }
 
    @Override
    public String transferencia(double valor, String conta){
        return super.transferirParaOutraConta(valor, conta)+" - Conta corrente";

    }

    public double getChequeEspecial(){
        return chequeEspecial;
    }
}
