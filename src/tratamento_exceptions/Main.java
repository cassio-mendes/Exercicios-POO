package tratamento_exceptions;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int vet[] = new int[4];

        System.out.println(">> Antes da exceção");
        try {
            vet[5] = 10;
            vet[4] = 3/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            String mensagem = "Você tentou acessar uma posição inexistente num array:\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, mensagem, "ERROR", JOptionPane.ERROR_MESSAGE);

        } catch (ArithmeticException e) {
            String mensagem = "Você tentou fazer uma divisão por 0:\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, mensagem, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println(">> Depois da exceção");
    }

}
