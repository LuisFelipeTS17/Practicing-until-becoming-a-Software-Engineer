package ex19_Sistema_de_Veiculos;

public class CarroEletrico extends Carro implements  Eletrico{
    private int nivelBateria;

    public CarroEletrico(String modelo, String placa, int nivelBateria) {
        super(modelo, placa);
        this.nivelBateria = nivelBateria;
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
