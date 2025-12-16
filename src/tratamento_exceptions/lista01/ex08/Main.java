package tratamento_exceptions.lista01.ex08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int saldo;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome e o saldo total da sua conta:");
        String nome = scan.next();

        try {
            saldo = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Saldo inválido, o valor será definido como 1000");
            saldo = 1000;
        }

        int opcao, valor;

        while(true) {
            System.out.println("\n" + nome + ", escolha uma ação:");
            mostrarMenu();

            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Quer depositar quanto?");

                    try {
                        valor = scan.nextInt();
                        depositar(valor);
                        saldo += valor;
                        System.out.println("Depósito concluído");

                    } catch (ValorNegativoException e) {
                        System.out.println(e.getMessage());
                        System.out.println("O saldo não será alterado");

                    } catch (InputMismatchException e2) {
                        System.out.println("Valor de entrada inválido.");
                        System.out.println("O saldo não será alterado");
                    }
                    break;

                case 2:
                    System.out.println("Quer sacar quanto?");

                    try {
                        valor = scan.nextInt();
                        sacar(valor);
                        saldo -= valor;
                        System.out.println("Saque concluído");

                    } catch (InputMismatchException e) {
                        System.out.println("Valor de entrada inválido.");
                        System.out.println("O saldo não será alterado");

                    } catch (SaldoInsuficienteException | ValorNegativoException e2) {
                        System.out.println(e2.getMessage());
                        System.out.println("O saldo não será alterado");
                    }
                    break;

                case 3:
                    scan.close();
                    salvar(nome);
            }
        }

    }

    static void mostrarMenu() {
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Salvar informações em arquivo e sair");
    }

    static void depositar(int valor) throws ValorNegativoException{
        if(valor <= 0) throw new ValorNegativoException("Valores menores ou iguais a zero são proibidos");
    }

    static void sacar(int valor) throws ValorNegativoException, SaldoInsuficienteException {
        if(valor <= 0) throw new ValorNegativoException("Valores menores ou iguais a zero são proibidos");

        if(valor > saldo) throw new SaldoInsuficienteException("Você não tem saldo pra isso");
    }

    static void salvar(String nome) {
        try {
            FileWriter writer = new FileWriter("dados.txt");
            writer.write("Nome: " + nome + " | Saldo: " + saldo);

        } catch (IOException e) {
            System.out.println("Não foi possível salvar as informações.");

        } finally {
            System.out.println("Encerrando...");

            System.exit(0);
        }
    }
    
}
