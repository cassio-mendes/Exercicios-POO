package lanchonetebaguncada;

public class Main {

    public static void main(String[] args) {
        //Instancia um cliente
        Cliente cliente = new Cliente("Ana", 22);

        //Instancia produtos
        Produto p1 = new Produto("X-Burguer", 15.0);
        Produto p2 = new Produto("Coxinha", 6.5);

        //Instancia a lanchonete
        Lanchonete lanchonete = new Lanchonete();

        //Adiciona os produtos à lanchonete
        lanchonete.adicionarProduto(p1);
        lanchonete.adicionarProduto(p2);

        //Exibe informações do cliente
        System.out.println(cliente);

        //Exibe informações dos produtos
        System.out.println(p1);
        System.out.println(p2);

        //Verifica se o cliente tem direito a desconto
        if(lanchonete.verificarDesconto(cliente)) {
            System.out.println("O(a) cliente " + cliente.getNome() + " tem desconto!");
            lanchonete.setTemDesconto(true);
        } else {
            System.out.println("O(a) cliente " + cliente.getNome() + " não tem desconto...");
            lanchonete.setTemDesconto(false);
        }

        //Calcula total
        System.out.printf("Total a pagar: R$%s", lanchonete.calcularPreco());
    }

}
