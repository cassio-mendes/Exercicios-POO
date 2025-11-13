package polimorfismo.lista01.ex01;

public class ConversorTemperatura {

    public static double converter(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double converter(double valor, String escala) {
        return switch (escala) {
            case "C" -> converter(valor); //Celsius -> F

            case "F" -> (valor + 32) / 1.8; //F -> Celsius

            case "K" -> valor + 273.15; //Celsius -> Kelvin

            default -> -1.0; //Saída de erro
        };
    }

    public static double converter(double valor, String escalaOrigem, String escalaDestino) {
        if(escalaOrigem.equalsIgnoreCase("celsius")) {
            return converter(valor, String.valueOf(escalaDestino.charAt(0)).toUpperCase());
            
        } else if (escalaOrigem.equalsIgnoreCase("fahrenheit")) {

            if(escalaDestino.equalsIgnoreCase("celsius")) {
                return converter(valor, "F");
            } else {
                return (valor - 32) * (5.0/9.0) + 273.15; //Fahrenheit -> Kelvin
            }
        } else {

            if(escalaDestino.equalsIgnoreCase("celsius")) {
                return valor - 273.15;
            } else {
                return (valor - 273.15) * (5.0/9.0) + 32;
            }
        }
    }

}
