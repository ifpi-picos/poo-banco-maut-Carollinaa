public class ContaCorente extends Conta{

    private double chequeEspecial;


    public ContaCorente(int numAgencia, int numConta) {
        super(numAgencia, numConta);
    }
 
    public void transferencia(double valor, Conta contaDestino){
        super.transferirParaOutraConta(valor, contaDestino);
    }
}
