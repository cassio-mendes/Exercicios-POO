package lanchonetebaguncada;

import java.util.ArrayList;

public class Lanchonete {

    private ArrayList<Produto> listaProdutos;
    private boolean temDesconto;

    public Lanchonete() {
        this.listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        listaProdutos.add(p);
    }

    public double calcularPreco() {
        double total = 0.0;
        for(Produto p : this.listaProdutos) {
            total += p.getPreco();
        }

        if(this.temDesconto) {
            total *= 0.9;
        }

        return total;
    }

    public boolean verificarDesconto(Cliente c) {
        return c.getIdade() < 25;
    }

    public void setTemDesconto(boolean temDesconto) {
        this.temDesconto = temDesconto;
    }
}
