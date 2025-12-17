package manipulacao_arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escrita {

    /*Representa o arquivo
        File arquivo = new File("dados.txt"); //Caminho relativo (na pasta raíz do projeto)

        //Caminho Relativo -> o arquivo tem que estar na pasta raíz, então só se escreve nome e formato (dados.txt)
        //Caminho Absoluto -> é o caminho completo, desde a pasta raiz do sistema (C:\Users\Eu\...\dados.txt)

        if(arquivo.exists()) { //Boa prática verificar antes de fazer leitura
            System.out.println("Existe!"); //Se o arquivo não existe, ele só vai existir dps que escrevermos algo
     }*/

    static final String CAMINHO = "C:\\Users\\0116238\\IdeaProjects\\Exercicios-POO\\src\\manipulacao_arquivos\\dados.txt";
    static File arquivo = new File(CAMINHO);

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;
        int opcao;

        do {
            System.out.print("Informe um nome: ");
            nome = scan.next();

            escrever(nome);

            System.out.println("Continuar? (1 - Sim, 2 - Não)");
            opcao = scan.nextInt();
            scan.skip("\n");

        } while(opcao != 2);
    }

    static void escrever(String nome) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(arquivo, true));
            writer.write("Nome: " + nome);
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        } finally {

            try {
                writer.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Erro ao fechar o BufferedWriter: " + e.getMessage());
            }
        }
    }

}
