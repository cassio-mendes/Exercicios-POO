package lanchonetebaguncada;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto[nome=" + this.nome + ", preco=" + this.preco +"]";
    }
}
