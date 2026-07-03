package _01_introducao_oo.area_retangulo.entities;

public class Rectangle {

    // Atributos privados
    private double width;
    private double height;

    // Getters e Setters para permitir o acesso controlado
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // --- MÉTODOS DO DIAGRAMA ---
    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
