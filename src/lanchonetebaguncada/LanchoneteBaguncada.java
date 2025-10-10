
package lanchonetebaguncada;

public class LanchoneteBaguncada {

    public static void main(String[] args) {
        // Dados do cliente
        String nomeCliente = "Ana";
        int idadeCliente = 22;

        // Dados dos lanches
        String lanche1 = "X-Burger";
        double preco1 = 15.0;

        String lanche2 = "Coxinha";
        double preco2 = 6.5;

        // Exibe informações do cliente
        exibirDadosCliente(nomeCliente, idadeCliente);

        // Mostra os detalhes dos lanches
        mostrarDetalhesLanche(lanche1, preco1);
        mostrarDetalhesLanche(lanche2, preco2);

        // Calcula total
        double total = preco1 + preco2;

        // Verifica se o cliente tem direito a desconto
        if (temDesconto(idadeCliente)) {
            total *= 0.9;
            System.out.println("Desconto aplicado!");
        }

        System.out.println("Total a pagar: R$ " + total);
    }


    static boolean temDesconto(int idade) {
        return idade < 25;
    }


    static void exibirDadosCliente(String nome, int idade) {
        System.out.println("Cliente: " + nome + " (" + idade + " anos)");
    }


    static void mostrarDetalhesLanche(String nome, double preco) {
        System.out.println("Lanche: " + nome + " - R$ " + preco);
    }
}