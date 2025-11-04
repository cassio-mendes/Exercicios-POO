package exerciciosHeranca.ex04;

public class Novo extends Imovel {

    private double valorAdicional;

    public Novo(String endereco, double preco, double valorAdicional) {
        super(endereco, preco);
        this.valorAdicional = valorAdicional;
    }

    public void imprimirValorAdicional() {
        System.out.println("Adicional: " + this.valorAdicional);
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
