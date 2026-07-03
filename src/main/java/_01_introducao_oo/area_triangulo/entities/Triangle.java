package _01_introducao_oo.area_triangulo.entities;

public class Triangle {
    // Atributos (as características do triângulo)
    public double a;
    public double b;
    public double c;

    // Metodo (a ação que o triangulo sabe fazer: aqui, calcular sua área)
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p -  a) * (p - b) * (p - c));
    }
}
