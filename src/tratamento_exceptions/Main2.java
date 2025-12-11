package tratamento_exceptions;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("informe dois números:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        try {
            System.out.println(dividir(a, b));

        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }*/


        int idade = scan.nextInt();
        try {
            validarIdade(idade);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scan.close();

        /*int num[] = {4, 8, 16, 32, 64, 128};
        int den[] = {2, 0, 4, 8, 32};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " + den[i] + " = " + num[i]/den[i]);

            } catch(ArithmeticException e1) {
                System.out.println("Divisão por 0 :(");

            } catch(ArrayIndexOutOfBoundsException e2) {
                System.out.println("Acesso a índices inexistentes no array :(");
            }
        }*/
    }

    static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }

    static void validarIdade(int idade) throws IllegalArgumentException {
        if(idade <= 0) throw new IllegalArgumentException("Idade inválida");
    }

}
