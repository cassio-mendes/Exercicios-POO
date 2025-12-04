package polimorfismo.lista01.ex03;

public class Despesa {

    private String descricao;
    protected double valor;

    public Despesa(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double calcularTotal() {
        return this.valor;
    }
}
