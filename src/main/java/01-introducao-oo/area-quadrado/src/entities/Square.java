package entities;

public class Square {
    // Atributos (as características do quadrado
    private double side;

    public void setSide(double side) {
        if(side <= 0) {
            throw new IllegalArgumentException("Invalid side value! Must be greater than zero.");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    // Metodo (a ação que o quadrado sabe fazer: aqui, calcular sua área)
    public double area() {
        double areaSquare = (side * side);
        return areaSquare;
    }
}
