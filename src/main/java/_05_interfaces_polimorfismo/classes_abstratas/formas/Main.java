package _05_interfaces_polimorfismo.classes_abstratas.formas;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo("Vermelho", 5.0);
        Retangulo r = new Retangulo("Azul", 4.0, 3.0);

        System.out.println("Cor: " + c.cor);
        System.out.println("Área do circulo: " + c.calcularArea());

        System.out.println("Cor: " + r.cor);
        System.out.println("Área do retangulo: " + r.calcularArea());
    }
}