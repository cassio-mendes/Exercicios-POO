package abstracao_interface;

public class Piano extends Instrumento implements Afinavel{

    public Piano(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando piano");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando piano");
    }
}
