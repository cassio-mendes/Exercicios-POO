package polimorfismo.lista01.ex02;

public class Transporte {

    protected int capacidade;
    protected double valorBase;

    public Transporte(int capacidade, double valorBase) {
        this.capacidade = capacidade;
        this.valorBase = valorBase;
    }

    public double calcularTarifa() {
        return this.valorBase;
    }

}
