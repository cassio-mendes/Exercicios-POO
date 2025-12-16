package tratamento_exceptions.lista01.ex06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int idade = -1;
            validarIdade(idade);
            System.out.println("Idade válida!");

        } catch (IllegalArgumentException e) {
            System.out.println("Idade inválida...");
        }
    }

    static void validarIdade(int idade) throws IllegalArgumentException{
        if(idade < 0) throw new IllegalArgumentException();
    }

}
