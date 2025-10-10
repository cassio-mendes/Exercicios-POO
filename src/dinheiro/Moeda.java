package dinheiro;

public class Moeda {

    private double valor;

    public Moeda() {
    }

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "R$" + String.format("%.2f",this.valor);
    }
}
