package exerciciosHeranca2.ex03;

public class Produto {

    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome + " | Preco: R$" + this.preco;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(obj == null)
            return false;

        Produto outroProduto = (Produto)obj;
        return this.nome.equals(outroProduto.getNome()) && this.preco == outroProduto.getPreco();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
