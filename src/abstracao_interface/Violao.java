package abstracao_interface;

public class Violao extends Instrumento implements Afinavel {

    public Violao(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando violão");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando violão");
    }
}
