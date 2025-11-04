package exerciciosHeranca.ex04;

public class Velho extends Imovel {

    private double desconto;

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public void imprimirDesconto() {
        System.out.println("Desconto: " + this.desconto);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
