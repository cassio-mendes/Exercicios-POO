package exercicios.carros;

public class Carro {

    private String modelo;
    private double velocidadeMaxima;
    private double velocidadeAtual;

    public Carro(String modelo, double velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public void acelerar(double incremento) {
        this.velocidadeAtual += incremento;

        if(this.velocidadeAtual > this.velocidadeMaxima)
            this.velocidadeAtual = this.velocidadeMaxima;
    }

    public void frear(double decremento) {
        this.velocidadeAtual -= decremento;

        if(this.velocidadeAtual < 0)
            this.velocidadeAtual = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
