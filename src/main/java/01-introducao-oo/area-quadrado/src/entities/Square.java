package entities;

public class Square {
    // Atributos (as características do quadrado
    public double side;

    // Metodo (a ação que o quadrado sabe fazer: aqui, calcular sua área)
    public double area() {
        double areaSquare = (side * side);
        return areaSquare;
    }
}
