package _02_encapsulamento_construtores.quadrado_encapsulado.aplication;

// Importa a classe Square do seu pacote específico e atualizado
import _02_encapsulamento_construtores.quadrado_encapsulado.entities.Square;
import java.util.Scanner;
import java.util.Locale;

public class ProgramSquare {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // Instanciando o objeto quadrado na memória
        Square square = new Square();

        System.out.print("Enter the side of the square: ");

        // Capturando o valor digitado e enviando de forma segura através do Setter
        square.setSide(input.nextDouble());

        // Chamando o método para calcular a área e armazenando o resultado
        double area = square.area();

        // Exibindo o resultado final consumindo o Getter e a área calculada
        System.out.println("The area of the square with side " + square.getSide() + " is: " + area);

        input.close();
    }
}