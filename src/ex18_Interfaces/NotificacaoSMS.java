package ex18_Interfaces;

public class NotificacaoSMS implements Notificavel {

    private String numeroTelefone;

    public NotificacaoSMS(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String getCanal() {
        return "NotificacaoSMS";
    }

    @Override
    public void enviar(String mensagem){
        System.out.println(mensagem + getCanal());
    }

}
