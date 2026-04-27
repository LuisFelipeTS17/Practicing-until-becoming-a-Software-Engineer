package ex11_Sobrecarga_Construtores;

public class ContaDigital {
    private String titular;
    private String numeroConta;
    private String agencia;
    private double saldo;
    static int gerarNumeroConta = 0;

    public ContaDigital(String titular, String agencia,  double saldo ) {
        this.titular = titular;
        this.agencia = agencia;
        gerarNumeroConta++;
        this.numeroConta = String.format("%05d", gerarNumeroConta);
        this.saldo = saldo;

    }

    public ContaDigital(String titular, String agencia) {
        this(titular, agencia,  0.0);

    }

    public ContaDigital(String titular) {
        this(titular, "0001",0.0);
    }

    public String getTitular() {
        return titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("titular: " + titular);
        System.out.println("agencia: " + agencia);
        System.out.println("numeroConta:  " + numeroConta);
        System.out.println("saldo: " + saldo);
    }
}
