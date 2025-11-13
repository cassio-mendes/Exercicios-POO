package polimorfismo.lista01.ex02;

public class Onibus extends Transporte {

    private int quantidadeParadas;

    public Onibus(int capacidade, double valorBase, int quantidadeParadas) {
        super(capacidade, valorBase);
        this.quantidadeParadas = quantidadeParadas;
    }

    @Override
    public double calcularTarifa() {
        return this.valorBase + (this.quantidadeParadas * 0.5);
    }
}
