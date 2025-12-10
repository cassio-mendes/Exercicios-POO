package abstracao_interface;

public abstract class Instrumento {

    String nome;

    public Instrumento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void tocar();
}
