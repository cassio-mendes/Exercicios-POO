package exerciciosHeranca2.ex02;

public class Main {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Caio", 3000);
        Gerente g = new Gerente("Luíz", 4000, 0.1);

        System.out.println(f);
        System.out.println(g);
    }

}
