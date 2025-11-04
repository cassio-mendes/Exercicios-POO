package exerciciosHeranca.ex01;

public class Tecnico extends Assistente {

    private double bonus;

    public Tecnico(String nome, double salario) {
        super(nome, salario);
        this.bonus = 0.1;
    }

    @Override
    public double ganhoAnual() {
        return (this.salario + (this.salario * this.bonus)) * 12;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
