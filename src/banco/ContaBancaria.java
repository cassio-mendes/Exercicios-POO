package banco;

public class ContaBancaria {

    private final String nomeTitular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nomeTitular) {
        this.nomeTitular = nomeTitular;

        do {
            this.numeroConta = (int) (Math.random() * 999);
        } while(this.numeroConta < 100);

        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if(valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public void consultarSaldo() {
        System.out.printf("\nTitular da conta: %s\n", this.nomeTitular);
        System.out.printf("Número da conta: %s\n", this.numeroConta);
        System.out.printf("Saldo atual: %s\n", this.saldo);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}
