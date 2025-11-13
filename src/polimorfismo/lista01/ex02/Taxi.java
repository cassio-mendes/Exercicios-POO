package polimorfismo.lista01.ex02;

public class Taxi extends Transporte {

    private double quilometragem;

    public Taxi(int capacidade, double valorBase, double quilometragem) {
        super(capacidade, valorBase);
        this.quilometragem = quilometragem;
    }

    @Override
    public double calcularTarifa() {
        return this.valorBase + (this.quilometragem * 2.0);
    }

}
