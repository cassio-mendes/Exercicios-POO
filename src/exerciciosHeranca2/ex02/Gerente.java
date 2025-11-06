package exerciciosHeranca2.ex02;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " | Bônus: " + this.bonus;
    }
}
