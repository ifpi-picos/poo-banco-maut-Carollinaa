public class Email implements Notificacao{
    
    @Override
    public void enviarNotificacao(String operacao, double valor){
        System.out.println("email: " + operacao +" realizado de "+ String.format("%.2f", valor) + " R$");
    }
}
