package polimorfismo.empresa;

public class Funcionario {

    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return this.salarioBase;
    }

    public double calcularSalario(double bonus) {
        return this.salarioBase + bonus;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Salário: " + calcularSalario();
    }

}
