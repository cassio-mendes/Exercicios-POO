package polimorfismo.empresa;

public class Gerente extends Funcionario {

    private double bonusGerencial;

    public Gerente(String nome, double salarioBase, double bonusGerencial) {
        super(nome, salarioBase);
        this.bonusGerencial = bonusGerencial;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.bonusGerencial;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "(Gerente) | Salário: " + calcularSalario();
    }
}
