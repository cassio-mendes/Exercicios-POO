package exercicios.lutadores;

public class Main {

    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[4];

        lutadores[0] = new Lutador("A", "Livre", 70);
        lutadores[1] = new Lutador("B", "Livre", 100);
        lutadores[2] = new Lutador("C", "Livre", 80);
        lutadores[3] = new Lutador("D");

        Lutador vencedor1 = lutadores[0].lutar(lutadores[1]);
        Lutador vencedor2 = lutadores[2].lutar(lutadores[3]);

        System.out.printf("%s VS %s -> Vencedor: %s\n", lutadores[0].getNome(), lutadores[1].getNome(), vencedor1.getNome());
        System.out.printf("%s VS %s -> Vencedor: %s\n", lutadores[2].getNome(), lutadores[3].getNome(), vencedor2.getNome());
        System.out.println("Lutador MAIS FORTE: " + vencedor1.lutar(vencedor2).getNome());
    }

}
