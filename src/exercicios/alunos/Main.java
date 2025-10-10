package exercicios.alunos;

public class Main {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[4];

        alunos[0] = new Aluno("Mateus");
        alunos[1] = new Aluno("Alberto", 6.0, 8.0);
        alunos[2] = new Aluno("Alex", 4.0, 5.5);
        alunos[3] = new Aluno("Osvaldo", 10.0, 10.0);

        System.out.println(alunos[0].calcularMedia());
        System.out.println(alunos[1].calcularMedia());
        System.out.println(alunos[2].calcularMedia());
        System.out.println(alunos[3].calcularMedia());

        for(Aluno a : alunos) {
            System.out.println(a.getNome() + ": " + (a.foiAprovado() ? "APROVADO" : "REPROVADO"));
        }

        System.out.println("Aluno com a maior média: " + maiorMedia(alunos));
    }

    private static String maiorMedia(Aluno[] alunos) {
        Aluno maiorMedia = alunos[0];
        for(Aluno a : alunos) {
            if(a.calcularMedia() > maiorMedia.calcularMedia()) {
                maiorMedia = a;
            }
        }

        return maiorMedia.getNome();
    }

}
