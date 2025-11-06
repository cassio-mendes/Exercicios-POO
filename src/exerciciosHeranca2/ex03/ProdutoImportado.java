package exerciciosHeranca2.ex03;

public class ProdutoImportado extends Produto {

    private double taxaImportacao;

    public ProdutoImportado(String nome, double preco, double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public String toString() {
        return super.toString() + " | Taxa de Importação: " + this.taxaImportacao;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) {
            return true;
        } else {
            ProdutoImportado p = (ProdutoImportado) obj;
            return this.taxaImportacao == p.getTaxaImportacao();
        }
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }
}
