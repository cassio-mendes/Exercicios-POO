package exerciciosHeranca2.ex01;

public class Professor extends Pessoa {

    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void falar() {
        super.falar();
        System.out.println(this.nome + ", professor da disciplina " + this.disciplina + ", está falando.");
    }
}
