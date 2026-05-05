package ex19_Sistema_de_Veiculos;

public class CarroConectado extends Carro implements Conectado{

    public CarroConectado(String modelo, String placa) {
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

}
