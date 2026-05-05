package ex19_Sistema_de_Veiculos;

public class Main {
    public static void main(String[] args) {
        CarroEletrico tesla = new CarroEletrico("TeslaOne",  "Ad4ed4", 100);
        tesla.carregarBateria();

        CarroConectado mustang = new CarroConectado("Ford mustang", "STR3A21");
        mustang.getStatusConexao();
        mustang.conectarRede("Conectado");

        CarroEletricoConectado teslaTwo = new CarroEletricoConectado("TeslaTwo", "TSB3I21");
        teslaTwo.carregarBateria();
        teslaTwo.conectarRede("Conectado");
        System.out.println(teslaTwo.getNivelBateria());
        teslaTwo.getStatusConexao();


    }
}
