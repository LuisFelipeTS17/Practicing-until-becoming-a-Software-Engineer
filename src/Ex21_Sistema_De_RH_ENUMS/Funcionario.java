package Ex21_Sistema_De_RH_ENUMS;

public class Funcionario {
    private String nome;
    private Cargo cargo;
    private  Departamento departamento;


    public Funcionario(String nome, Cargo cargo, Departamento departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;

    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public double calcularSalarioTotal() {
       return cargo.getSalarioBase() + (cargo.getSalarioBase() * cargo.getPercentualBonus());
    }

    public void exibirFicha() {
        System.out.println("nome: " + nome);
        System.out.println("cargo: " + cargo);
        System.out.println("departamento: " + departamento);
        System.out.println("Sálario total com Bônus: " + calcularSalarioTotal());
    }
}
