package Ex21_Sistema_De_RH_ENUMS;

public enum Cargo {
    JUNIOR(2000, 0.05),
    PLENO(4500, 0.07),
    SENIOR(5800, 0.10),
    GERENTE(4200, 0.08);


    Cargo(double salarioBase, double percentualBonus) {
        this.salarioBase = salarioBase;
        this.percentualBonus = percentualBonus;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }

    private final double salarioBase;
    private final double percentualBonus;

    public double getSalarioBase() {
        return salarioBase;
    }

}
