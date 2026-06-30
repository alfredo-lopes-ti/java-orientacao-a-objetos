package classes_abstratas.formas;

public abstract class Forma {
    public String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public abstract double calcularArea();
}