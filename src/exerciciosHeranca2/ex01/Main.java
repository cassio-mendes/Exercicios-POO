package exerciciosHeranca2.ex01;

public class Main {

    public static void main(String[] args) {
        Aluno a = new Aluno("Pedro", 26, "Biologia");
        Professor p = new Professor("Alberto", 41, "Biologia");

        a.falar();
        p.falar();
    }

}
