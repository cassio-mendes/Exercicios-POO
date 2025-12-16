package tratamento_exceptions.lista01.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            System.out.println(n1 / n2);

        } catch(ArithmeticException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }

    }

}
