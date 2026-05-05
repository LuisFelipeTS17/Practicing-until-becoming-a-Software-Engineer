package ex19_Sistema_de_Veiculos;

public class CarroEletricoConectado extends Carro implements Eletrico,Conectado {
    private int nivelBateria;

    public CarroEletricoConectado(String modelo, String placa) {
        super(modelo, placa);
    }

    @Override
    public  void conectarRede(String rede){
        System.out.println("Conectando rede! Aguarde... " +  rede + getStatusConexao());
    }


    @Override
    public String getStatusConexao(){
        return " Conectado!";
    }

    @Override
    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void carregarBateria(){
        System.out.println("Carregando o seu carro...Aguarde...");
        setNivelBateria(100);
    }
}
