package polimorfismo.empresa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*Funcionario f1 = new Funcionario("AAA", 5000.0);
        Funcionario f2 = new Funcionario("Maria", 6500.0);

        System.out.println(f1.calcularSalario());
        System.out.println(f1);
        System.out.println(f2.calcularSalario(300));
        System.out.println(f2);*/

        Funcionario f1 = new Funcionario("A", 1000);
        Funcionario g = new Gerente("B", 2000, 250);
        Funcionario e = new Estagiario("C", 30, 40);

        ArrayList<Funcionario> array = new ArrayList<>();
        array.add(f1);
        array.add(g);
        array.add(e);

        double total = 0.0;
        for(Funcionario f : array) {
            System.out.println(f);

            if(f instanceof Gerente) {
                total += f.calcularSalario();
            }
        }
        System.out.println("Total gasto com gerentes: " + total);

    }

}
