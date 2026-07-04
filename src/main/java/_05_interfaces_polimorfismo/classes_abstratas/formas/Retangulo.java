package _05_interfaces_polimorfismo.classes_abstratas.formas;

public class Retangulo extends Forma {
    double largura;
    double altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
