package polimorfismo.lista01.ex01;

public class Main {

    public static void main(String[] args) {
        System.out.println("Celsius -> Fahrenheit: " + ConversorTemperatura.converter(15.0));
        System.out.println("Fahrenheit -> Celsius: " + ConversorTemperatura.converter(100.0, "F"));
        System.out.println("Celsius -> Kelvin: " + ConversorTemperatura.converter(28.0, "K"));
        System.out.println("Fahrenheit -> Kelvin: " + ConversorTemperatura.converter(100.0, "fahrenheit", "kelvin"));
        System.out.println("Kelvin -> Fahrenheit: " + ConversorTemperatura.converter(100.0, "kelvin", "fahrenheit"));
        System.out.println("Kelvin -> Celsius: " + ConversorTemperatura.converter(100.0, "kelvin", "celsius"));
    }

}
