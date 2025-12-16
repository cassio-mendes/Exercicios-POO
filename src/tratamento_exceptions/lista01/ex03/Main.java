package tratamento_exceptions.lista01.ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int n = scan.nextInt();
            System.out.println(n/2);

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());

        } finally {
            scan.close();
            System.out.println("Encerrando...");
        }
    }

}
