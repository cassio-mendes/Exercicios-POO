package polimorfismo.lista01.ex03;

public class DespesaViagem extends Despesa {

    private double valorPassagem, valorHospedagem;

    public DespesaViagem(String descricao, double valor, double valorPassagem, double valorHospedagem) {
        super(descricao, valor);
        this.valorPassagem = valorPassagem;
        this.valorHospedagem = valorHospedagem;
    }

    @Override
    public double calcularTotal() {
        return this.valor + this.valorHospedagem + this.valorPassagem;
    }

}
