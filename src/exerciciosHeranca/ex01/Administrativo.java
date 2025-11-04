package exerciciosHeranca.ex01;

public class Administrativo extends Assistente {

    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, String turno) {
        super(nome, salario);
        this.turno = turno;
        this.adicionalNoturno = 0.15;
    }

    @Override
    public double ganhoAnual() {
        if(this.turno.equalsIgnoreCase("noturno")) {
            return this.salario + (this.salario * this.adicionalNoturno);
        } else {
            return this.salario;
        }
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
