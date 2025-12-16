package tratamento_exceptions.lista01.ex04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (FileReader leitor = new FileReader(new File("dados.txt"));) {
            System.out.println("Lido com sucesso! " + leitor);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");

        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo");
        }
    }

}
