package exercicioGerenciamento;

public class Main {

    public static void main(String[] args) throws Exception {
        GestaoFuncionarios gestor = new GestaoFuncionarios();

        gestor.adicionarFuncionario(new Funcionario("Ariel", "Programador", 26, 3000.0));
        gestor.adicionarFuncionario(new Funcionario("Beto", "Programador", 22, 3000.0));
        gestor.adicionarFuncionario(new Funcionario("Cleiton", "Designer", 30, 2500.0));

        gestor.listarFuncionarios();
        gestor.alterarSalario("Ariel", 3500.0);
        gestor.alterarSalario("dd", 10000.0);

        System.out.println("ENCONTRADO: " + gestor.pesquisarNome("Beto"));
        System.out.println("REMOVIDO: " + gestor.removerFuncionario("Beto"));
        System.out.println("ENCONTRADO: " + gestor.pesquisarNome("Beto"));

        System.out.println();
        gestor.listarFuncionarios();

        System.out.println("Lista de Programadores:");
        System.out.println(gestor.filtrarFuncoes("Programador"));
    }

}
