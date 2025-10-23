package exerciciosTarefas;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tarefa t1 = new Tarefa("Lavar a louça", 2);
        Tarefa t2 = new Tarefa("Passear com o cachorro", 1);
        Tarefa t3 = new Tarefa("Varrer o chão", 3);

        ArrayList<Tarefa> lista = new ArrayList<>();
        lista.add(t3);
        lista.add(t1);
        lista.add(t2);
        lista.reversed();

        for(Tarefa t : lista) {
            if(t.getPrioridade() == 2) {
                t.setStatus(true);
            }

            System.out.println(t);
        }

        System.out.println("Há um total de " + lista.size() + " tarefas cadastradas");
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getPrioridade() == 3) {
                lista.remove(lista.get(i));
            }
        }
        System.out.println("Há um total de " + lista.size() + " tarefas cadastradas");
    }

}
