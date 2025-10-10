package lojacarros;

public class Carro {

    //Atributos:
    private String cor;
    private String marca;
    private String modelo;
    private int velocidade;
    private boolean ligado;

    //Métodos:
    //Construtor
    public Carro(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
        this.ligado = false;
    }

    //Getters e Setters
    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Funcionalidades
    public void acelerar(int velocidade) {
        if(this.ligado) {
            this.velocidade += velocidade;
        }
    }

    public void frear() {
        if(this.ligado) {
            this.velocidade = 0;
        }
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    //toString() -> Informações da classe dentro de uma única String
    @Override
    public String toString() {
        return "Carro[cor=" + this.cor + ", marca=" + this.marca + ", modelo=" + this.modelo + ", velocidade=" +
                this.velocidade + ", ligado=" + this.ligado + "]";
    }
}
