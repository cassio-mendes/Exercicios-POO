package exerciciosTarefas;

public class Pedido {

    private int id;
    private String nome;
    private double valor;

    public Pedido() {
        this.id = 0;
        this.nome = "Cliente desconhecido";
        this.valor = 0.0;
    }

    public Pedido(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pedido{id=" + this.id + ", nome=" + this.nome + ", valor=" + this.valor + "}";
    }
}
