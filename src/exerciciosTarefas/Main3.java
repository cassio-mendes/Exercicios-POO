package exerciciosTarefas;

import java.util.ArrayList;

public class Main3 {

    public static void main(String[] args) {
        ArrayList<Pedido> lista = new ArrayList<>();

        lista.add(new Pedido());
        lista.add(new Pedido(1, "Alberto", 15.50));
        lista.add(new Pedido(2, "Carlos", 32.90));
        lista.add(new Pedido(3, "Júlia", 24.00));

        double valorAtual = lista.getFirst().getValor();
        lista.getFirst().setValor(valorAtual + (valorAtual * 0.1));

        for(Pedido p : lista) {
            System.out.println(p);
        }

        System.out.println("Há um total de " + lista.size() + " pedidos cadastrados");

        double soma = 0.0;
        for(Pedido p : lista) {
            soma += p.getValor();
        }

        System.out.println("Soma dos valores de cada pedido: R$" + String.format("%.2f", soma));
    }

}
