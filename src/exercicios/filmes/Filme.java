package exercicios.filmes;

public class Filme {

    private String titulo;
    private String genero;
    private int duracao; //Em minutos

    public Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public Filme(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = 90;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }
}
