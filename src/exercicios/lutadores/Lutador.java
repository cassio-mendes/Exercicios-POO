package exercicios.lutadores;

public class Lutador {

    private String nome;
    private String categoria;
    private int forca;

    public Lutador(String nome, String categoria, int forca) {
        this.nome = nome;
        this.categoria = categoria;
        this.forca = forca;
    }

    public Lutador(String nome) {
        this.nome = nome;
        this.categoria = "Livre";
        this.forca = 50;
    }

    public Lutador lutar(Lutador outro) {
        return this.forca > outro.getForca() ? this : outro;
    }

    public String getNome() {
        return nome;
    }

    public int getForca() {
        return forca;
    }

}
