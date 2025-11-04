package exerciciosHeranca.ex03;

public class Normal extends Ingresso {

    public Normal(double valor) {
        super(valor);
    }

    public void imprimeMensagem() {
        System.out.println("Ingresso Normal");
    }

}
