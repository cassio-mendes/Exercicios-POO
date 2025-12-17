package manipulacao_arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Leitura {

    static final String CAMINHO = "C:\\Users\\0116238\\IdeaProjects\\Exercicios-POO\\src\\manipulacao_arquivos\\dados.txt";
    static File arquivo = new File(CAMINHO);

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Imprimindo linhas do arquivo:");

        if(arquivo.exists()) {
            ler();
        } else {
            System.out.println("O arquivo não existe :(");
        }
    }

    static void ler() {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(arquivo));
            String linha;

            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch(IOException e) {
            System.out.println("Não foi possível ler o arquivo: " + e.getMessage());

        } finally {

            try {
                reader.close();
            } catch(IOException | NullPointerException e) {
                System.out.println("Erro ao fechar o BufferedReader: " + e.getMessage());
            }
        }
    }

}
