package exercicioGerenciamento;

public class Funcionario {

    private String nome;
    private String funcao;
    private int idade;
    private double salario;
    private final int id;

    private static int proximoId = 0;

    public Funcionario(String nome, String funcao, int idade, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.idade = idade;
        this.salario = salario;
        this.id = proximoId;
        proximoId++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.isEmpty()) {
            throw new Exception("ERRO: O nome não pode estar vazio");
        } else {
            this.nome = nome;
        }
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) throws Exception {
        if(funcao.isEmpty()) {
            throw new Exception("ERRO: A função não pode estar vazia");
        } else {
            this.funcao = funcao;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if(idade <= 0) {
            throw new Exception("ERRO: Idade não pode ser negativa ou igual a zero");
        } else {
            this.idade = idade;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws Exception {
        if(salario <= 0.0) {
            throw new Exception("ERRO: Salário não pode ser menor ou igual a zero");
        } else {
            this.salario = salario;
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome='" + nome + '\'' + ", funcao='" + funcao + '\'' + ", idade=" + idade +
                ", salario=" + salario + ", id=" + id + '}';
    }
}
