package exercicios.alunos;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome) {
        this.nome = nome;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public boolean foiAprovado() {
        return calcularMedia() >= 6.0;
    }

    public String getNome() {
        return nome;
    }
}
