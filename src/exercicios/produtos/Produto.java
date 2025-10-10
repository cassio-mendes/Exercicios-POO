package exercicios.produtos;

public class Produto {

    private String nome;
    private double preco;
    private int quantEstoque;

    public Produto(String nome, double preco, int quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = 10;
    }

    public void vender(int quant) {
        if(quant > this.quantEstoque) {
            System.out.println("Não há o suficiente em estoque");
        } else {
            this.quantEstoque -= quant;
        }
    }

    public void repor(int quant) {
        this.quantEstoque += quant;
    }

    public double calcularValorTotal() {
        return this.preco * this.quantEstoque;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }
}
