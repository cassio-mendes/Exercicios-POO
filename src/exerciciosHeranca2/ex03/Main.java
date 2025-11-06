package exerciciosHeranca2.ex03;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto("Maçã", 2.0);
        Produto p2 = new Produto("Maçã", 2.0);

        if(p1.equals(p2)) {
            System.out.println("São iguais!");
        } else {
            System.out.println("Não são iguais...");
        }

        ProdutoImportado pi1 = new ProdutoImportado("Celular", 1000.0, 0.2);
        ProdutoImportado pi2 = new ProdutoImportado("Tablet", 1200.0, 0.1);

        if(pi1.equals(pi2)) {
            System.out.println("São iguais!");
        } else {
            System.out.println("Não são iguais...");
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(pi1);
        System.out.println(pi2);
    }

}
