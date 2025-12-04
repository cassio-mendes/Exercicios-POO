package polimorfismo.lista01.ex03;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Despesa> array = new ArrayList<>();

        array.add(new Despesa("Despesa qualquer", 100.0));
        array.add(new DespesaViagem("Viagem", 1000.0, 1500.0, 900.0));
        array.add(new DespesaAlimentacao("Comida", 500.0, 50.0));

        double total;
        for(Despesa d : array) {
            if(d instanceof DespesaViagem) {
                DespesaViagem despesa = (DespesaViagem) d;
                total = despesa.calcularTotal();
                
            } else if (d instanceof DespesaAlimentacao) {
                DespesaAlimentacao despesa = (DespesaAlimentacao) d;
                total = despesa.calcularTotal();

            } else {
                total = d.calcularTotal();
            }

            System.out.println("Total: R$" + total);
        }
    }

}
