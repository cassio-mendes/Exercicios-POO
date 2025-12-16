package tratamento_exceptions.lista01.ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {
            File f = carregarArquivo("dados.txt");
            System.out.println("Arquivo carregado");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
    }

    static File carregarArquivo(String nome) throws FileNotFoundException {
        return new File(nome);
    }

}
