package exercicios.filmes;

public class Main {

    public static void main(String[] args) {
        Filme[] catalogo = new Filme[5];

        catalogo[0] = new Filme("FILME A", "acao", 120);
        catalogo[1] = new Filme("FILME B", "romance");
        catalogo[2] = new Filme("FILME C", "terror", 100);
        catalogo[3] = new Filme("FILME D", "sci-fi", 150);
        catalogo[4] = new Filme("FILME E", "fantasia");

        System.out.println("O filme mais longo é " + definirMaiorFilme(catalogo).getTitulo());
        System.out.println("A média de duração dos filmes é " + calcularMediaFilmes(catalogo) + " minutos");
    }

    private static Filme definirMaiorFilme(Filme[] catalogo) {
        Filme filmeMaisLongo = catalogo[0];
        for(Filme f : catalogo) {
            if(f.getDuracao() > filmeMaisLongo.getDuracao()) {
                filmeMaisLongo = f;
            }
        }

        return filmeMaisLongo;
    }

    private static int calcularMediaFilmes(Filme[] catalogo) {
        int soma = 0;
        for(Filme f : catalogo) {
            soma += f.getDuracao();
        }

        return soma / catalogo.length;
    }

}
