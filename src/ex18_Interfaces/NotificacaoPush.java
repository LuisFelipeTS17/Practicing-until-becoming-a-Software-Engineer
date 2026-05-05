package ex18_Interfaces;

public class NotificacaoPush implements Notificavel  {
    private String deviceToken;

    public NotificacaoPush(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    @Override
    public String getCanal() {
        return "NotificacaoPush";
    }

    @Override
    public void enviar(String mensagem){
        System.out.println(mensagem + getCanal());
    }
}
