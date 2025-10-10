package banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ContaBancaria[] contas = new ContaBancaria[4];
        contas[0] = new ContaBancaria("Pedro");
        contas[1] = new ContaBancaria("Ana");
        contas[2] = new ContaBancaria("Jéssica");
        contas[3] = new ContaBancaria("Arthur");

        System.out.print("Informe o nome do titular da conta a ser buscada, ou o seu número: ");
        String resposta = input.next();

        int indice = buscarConta(contas, resposta);
        if(indice == -1) {
            System.out.println("Não há uma conta correspondente :(");
        } else {
            System.out.printf("A conta está no índice %s", indice);

            int opcao;
            do {
                mostrarMenu();
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Informe o valor a ser depositado: ");
                        contas[indice].depositar(input.nextDouble()); break;

                    case 2:
                        System.out.print("Informe o valor a ser sacado: ");
                        contas[indice].sacar(input.nextDouble()); break;

                    case 3:
                        contas[indice].consultarSaldo();

                    case 0: break;

                    default: System.out.println("Opção inválida >:(");
                }
            } while(opcao != 0);
        }
    }

    static int buscarConta(ContaBancaria[] contas, String resposta) {
        for (int i = 0; i < contas.length; i++) {
            if(contas[i].getNomeTitular().equalsIgnoreCase(resposta) ||
                    String.valueOf(contas[i].getNumeroConta()).equalsIgnoreCase(resposta)) {
                return i;
            }
        }

        return -1;
    }

    static void mostrarMenu() {
        System.out.println("\n1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("0 - SAIR");
        System.out.print("Informe sua escolha: ");
    }

}
