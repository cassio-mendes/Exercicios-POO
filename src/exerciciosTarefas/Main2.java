package exerciciosTarefas;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<Contato> lista = new ArrayList<>();

        lista.add(new Contato("Cláudio", "11111111", "claudio@gmail.com"));
        lista.add(new Contato("Bianca", "22222222", "bianca@gmail.com"));
        lista.add(new Contato("César", "33333333", "cesar@gmail.com"));
        lista.add(new Contato("Ana", "44444444", "ana@gmail.com"));
        lista.add(new Contato());

        lista.get(3).setEmail("novoEmail@gmail.com");

        for(Contato c : lista) {
            System.out.println(c);
        }

        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNome().equalsIgnoreCase("Sem nome")) {
                lista.remove(i);
            }
        }

        System.out.println("Há um total de " + lista.size() + " contatos restantes");
    }

}
