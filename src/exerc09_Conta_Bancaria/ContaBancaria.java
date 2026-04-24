package exerc09_Conta_Bancaria;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor Invalido");
        }else {
            saldo +=valor;
            System.out.printf("Depósito realizado! Saldo atual:R$%.2f " , saldo);
        }
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0 || saldo < valor) {
            System.out.println("Saque inválido!");
        } else {
            saldo -=valor;
            System.out.printf("Saque realizado! Saldo atual: R$%.2f", saldo);
        }
    }

    public void exibirDados() {

        System.out.println("Titular: " + getTitular());
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.printf("Saldo:R$ %.2f ", saldo);

    }

}
