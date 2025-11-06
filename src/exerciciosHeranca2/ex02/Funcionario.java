package exerciciosHeranca2.ex02;

public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario: " + this.nome + " | Salário: R$" + this.salario;
    }
}
