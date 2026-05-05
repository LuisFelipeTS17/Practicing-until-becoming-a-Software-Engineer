package ex18_Interfaces;

public class NotificacaoEmail implements Notificavel {
    private String destinatario;
    private String assunto;

    public NotificacaoEmail(String destinatario, String assunto) {
        this.destinatario = destinatario;
        this.assunto = assunto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String getCanal() {
        return "NotificacaoEmail";
    }

    @Override
    public void enviar(String mensagem){
        System.out.println(mensagem + getCanal());
    }
}
