package exerciciosTarefas;

public class Tarefa {

    private String descricao;
    private int prioridade;
    private boolean status;

    public Tarefa() {
        this.descricao = "Sem descrição";
        this.prioridade = 3;
        this.status = false;
    }

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = false;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{descricao=" + this.descricao + ", prioridade=" + this.prioridade + ", status=" + this.status + "}";
    }
}
