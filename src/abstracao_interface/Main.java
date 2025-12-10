package abstracao_interface;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Instrumento> array = new ArrayList<>();

        Instrumento piano = new Piano("Piano");
        Instrumento violao = new Violao("Violão");
        Instrumento flauta = new Flauta("Flauta");

        piano.tocar();
        violao.tocar();
        flauta.tocar();
        System.out.println();

        Piano p = (Piano)piano;
        p.afinar();

        Violao v = (Violao)violao;
        v.afinar();
    }

}
