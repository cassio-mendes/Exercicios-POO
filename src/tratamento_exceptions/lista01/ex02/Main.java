package tratamento_exceptions.lista01.ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor1 = {2, 4, 6, 8, 10};
        int[] vetor2 = new int[4];

        try {
            System.out.println("Valores do vetor2:");
            for (int i = 0; i < vetor2.length; i++) {
                vetor2[i] = scan.nextInt();
            }

            System.out.println("Valores vetor1:");
            for (int i = 0; i < vetor1.length; i++) {
                System.out.println(vetor1[i] + ", ");
            }

            System.out.println("Valores vetor2:");
            for (int i = 0; i < vetor2.length; i++) {
                System.out.println(vetor2[i] + ", ");
            }

            System.out.println("Divisões:");
            for (int i = 0; i < vetor1.length; i++) {
                System.out.println(vetor1[i] / vetor2[i]);
            }

        } catch (ArrayIndexOutOfBoundsException | InputMismatchException | ArithmeticException e1) {
            System.out.println(e1.getMessage());

        } catch (Exception e2) {
            System.out.println("Exceção geral: " + e2.getMessage());
        }
    }

}
