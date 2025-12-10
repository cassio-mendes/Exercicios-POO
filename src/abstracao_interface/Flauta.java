package abstracao_interface;

public class Flauta extends Instrumento {

    public Flauta(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando flauta");
    }
}
