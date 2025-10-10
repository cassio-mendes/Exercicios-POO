package exercicios.produtos;

public class Main {

    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];

        produtos[0] = new Produto("Batata", 2.0, 60);
        produtos[1] = new Produto("Laranja", 2.5, 100);
        produtos[2] = new Produto("Vassoura", 30.0, 15);
        produtos[3] = new Produto("Beterraba", 2.2, 25);
        produtos[4] = new Produto("Sabão", 20.0);

        double total = 0.0;
        for(Produto p : produtos) {
            total += p.calcularValorTotal();
        }

        System.out.println("Valor total do estoque: " + total);
        System.out.println("Produto em menor quantidade: " + menorQuantidade(produtos));
    }

    private static String menorQuantidade(Produto[] produtos) {
        Produto menorQuant = produtos[0];
        for(Produto p : produtos) {
            if(p.getQuantEstoque() < menorQuant.getQuantEstoque()) {
                menorQuant = p;
            }
        }

        return menorQuant.getNome();
    }

}
