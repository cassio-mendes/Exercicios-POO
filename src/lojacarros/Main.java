package lojacarros;

public class Main {

    public static void main(String[] args) {
        Carro c = new Carro("Branco", "Chevrolet", "Ônix");
        System.out.println("Carro 1: " + c);

        c.ligar();
        c.acelerar(30);
        System.out.println("\nCarro 1: " + c);

        Carro c2 = new Carro("Vermelho", "Fiat", "Uno");
        System.out.println("\nCarro 2: " + c2);
    }

}
