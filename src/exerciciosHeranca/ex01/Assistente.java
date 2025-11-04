package exerciciosHeranca.ex01;

public class Assistente extends Funcionario {

    protected int matricula;
    private static int proximaMatricula = 1;

    public Assistente(String nome, double salario) {
        super(nome, salario);
        this.matricula = proximaMatricula;
        proximaMatricula++;
    }

    @Override
    public void exibeDados() {
        System.out.println("Assistente[nome=" + this.nome + ", salario=" + this.salario + ", matricula=" +
        this.matricula + "]");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
