package tratamento_exceptions.lista01.ex07;

public class Main {

    public static void main(String[] args) {
        try {
            sacar(2000);
            System.out.println("Saque concluído");

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    static void sacar(int valor) throws SaldoInsuficienteException {
        int saldoDisponivel = 1000;
        if(valor < saldoDisponivel) throw new SaldoInsuficienteException("Saldo insuficiente...");
    }

}
