package exerciciosHeranca.ex03;

public class CamaroteSuperior extends VIP {

    private double valorAdicionalCamarote;

    public CamaroteSuperior(double valor, double valorAdicional, double valorAdicionalCamarote) {
        super(valor, valorAdicional);
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    @Override
    public double valorVIP() {
        return this.valor + this.valorAdicional + this.valorAdicional;
    }

}
