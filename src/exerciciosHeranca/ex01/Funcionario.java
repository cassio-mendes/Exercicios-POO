package exerciciosHeranca.ex01;

public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor) {
        this.salario += valor;
    }

    public double ganhoAnual() {
        return this.salario * 12;
    }

    public void exibeDados() {
        System.out.println("Funcionario[nome=" + this.nome + ", salario=" + this.salario + "]");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
