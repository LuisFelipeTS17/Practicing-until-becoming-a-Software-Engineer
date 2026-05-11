package Ex21_Sistema_De_RH_ENUMS;

public class Main {
    public static void main(String[] args) {
        Funcionario felipe = new Funcionario("Felipe" , Cargo.JUNIOR, Departamento.TECNOLOGIA);
        Funcionario rodrigo = new Funcionario("Rodrigo", Cargo.GERENTE, Departamento.COMERCIAL);
        Funcionario kaique= new Funcionario("Kaique", Cargo.SENIOR, Departamento.RH);

        felipe.exibirFicha();
        rodrigo.exibirFicha();
        kaique.exibirFicha();
    }
}
