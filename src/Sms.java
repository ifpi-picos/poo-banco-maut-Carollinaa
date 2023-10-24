public class Sms implements Notificacao{

    @Override
    public void enviarNotificacao(String operacao, double valor) {
        System.out.println("sms: " + operacao +" realizado de "+ String.format("%.2f", valor) + " R$");
    }
    
}
