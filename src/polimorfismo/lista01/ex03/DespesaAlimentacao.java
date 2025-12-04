package polimorfismo.lista01.ex03;

public class DespesaAlimentacao extends Despesa {

    private double gorjeta;

    public DespesaAlimentacao(String descricao, double valor, double gorjeta) {
        super(descricao, valor);
        this.gorjeta = gorjeta;
    }

    @Override
    public double calcularTotal() {
        return this.valor + this.gorjeta;
    }
}
