package exercicios.carros;

public class Main {

    public static void main(String[] args) {
        Carro[] carros = new Carro[3];

        carros[0] = new Carro("Ônix", 200.0);
        carros[1] = new Carro("Camaro", 230.0);
        carros[2] = new Carro("Porsche", 280.0);

        carros[0].acelerar((int)(Math.random() * 99));
        carros[1].acelerar((int)(Math.random() * 99));
        carros[2].acelerar((int)(Math.random() * 99));

        System.out.println(carros[0].getVelocidadeAtual());
        System.out.println(carros[1].getVelocidadeAtual());
        System.out.println(carros[2].getVelocidadeAtual());

        System.out.println("O carro mais rápido agora é: " + carroMaisRapido(carros));
    }

    private static String carroMaisRapido(Carro[] carros) {
        Carro maisRapido = carros[0];
        for(Carro c : carros) {
            if(c.getVelocidadeAtual() > maisRapido.getVelocidadeAtual()) {
                maisRapido = c;
            }
        }

        return maisRapido.getModelo();
    }

}
