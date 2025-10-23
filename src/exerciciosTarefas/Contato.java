package exerciciosTarefas;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public Contato() {
        this.nome = "Sem nome";
        this.telefone = "Sem telefone";
        this.email = "Sem email";
    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{nome=" + this.nome + ", telefone=" + this.telefone + ", email=" + this.email + "}";
    }
}
