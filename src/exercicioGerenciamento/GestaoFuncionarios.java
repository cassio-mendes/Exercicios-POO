package exercicioGerenciamento;

import java.util.ArrayList;

public class GestaoFuncionarios {

    private ArrayList<Funcionario> listaFuncionarios;

    public GestaoFuncionarios() {
        this.listaFuncionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        this.listaFuncionarios.add(f);
    }

    public void listarFuncionarios() throws Exception {
        if(this.listaFuncionarios.isEmpty()) {
            throw new Exception("ERRO: A lista está vazia");
        } else {
            for(Funcionario f : this.listaFuncionarios) {
                System.out.printf("Funcionario{nome=%s, funcao=%s, idade=%s, salario=%s}\n", f.getNome(), f.getFuncao(),
                        f.getIdade(), f.getSalario());
            }
        }
    }

    public Funcionario pesquisarNome(String nome) throws Exception {
        if(this.listaFuncionarios.isEmpty()) {
            throw new Exception("ERRO: A lista está vazia");
        } else {
            for(Funcionario f : this.listaFuncionarios) {
                if(f.getNome().equals(nome)) {
                    return f;
                }
            }

            return null;
        }
    }

    public boolean removerFuncionario(Funcionario f) throws Exception {
        if(this.listaFuncionarios.isEmpty()) {
            throw new Exception("ERRO: A lista está vazia");
        } else {
            return this.listaFuncionarios.remove(f);
        }
    }

    public void alterarSalario(String nome, double novoSalario) throws Exception {
        if(this.listaFuncionarios.isEmpty()) {
            throw new Exception("ERRO: A lista está vazia");
        } else {
            for(Funcionario f : this.listaFuncionarios) {
                if(f.getNome().equals(nome)) {
                    f.setSalario(novoSalario);
                }
            }
        }
    }

    public ArrayList<Funcionario> filtrarFuncoes(String funcao) throws Exception {
        if(this.listaFuncionarios.isEmpty()) {
            throw new Exception("ERRO: A lista está vazia");
        } else {
            ArrayList<Funcionario> listaFiltrada = new ArrayList<>();

            for(Funcionario f : this.listaFuncionarios) {
                if(f.getFuncao().equals(funcao)) {
                    listaFiltrada.add(f);
                }
            }

            return listaFiltrada.isEmpty() ? null : listaFiltrada;
        }
    }

}
