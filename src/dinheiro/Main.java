package dinheiro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Valor da moeda: ");

        double valor;
        do {
            valor = input.nextDouble();

            if(valor < -1000.0)
                System.out.println("Valor abaixo do mínimo");
            else if(valor > 1000.0)
                System.out.println("Valor acima do mínimo");

        } while(valor < -1000.0 || valor > 1000.0);

        Moeda real = new Moeda(valor);
        System.out.println("Valor da moeda: " + real);
        real.setValor(1000);
        System.out.println("Novo valor: " + real);
    }

}
