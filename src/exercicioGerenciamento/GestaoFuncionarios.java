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
            System.out.println("Lista de funcionários:");
            for(Funcionario f : this.listaFuncionarios) {
                System.out.println(f);
            }
            System.out.println();
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

    public Funcionario removerFuncionario(String nome) throws Exception {
        if(this.listaFuncionarios.isEmpty()) {
            throw new Exception("ERRO: A lista está vazia");
        } else {
            for(int i = 0; i < this.listaFuncionarios.size(); i++) {
                if(this.listaFuncionarios.get(i).getNome().equals(nome)) {
                    return this.listaFuncionarios.remove(i);
                }
            }

            return null;
        }
    }

    public void alterarSalario(String nome, double novoSalario) throws Exception {
        if(this.listaFuncionarios.isEmpty()) {
            throw new Exception("ERRO: A lista está vazia");
        } else {
            for(Funcionario f : this.listaFuncionarios) {
                if(f.getNome().equals(nome)) {
                    f.setSalario(novoSalario);
                    break;
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

            return listaFiltrada;
        }
    }

}
