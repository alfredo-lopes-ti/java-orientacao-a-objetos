package _01_introducao_oo.area_quadrado.application;

import _01_introducao_oo.area_quadrado.entities.Square;
import java.util.Scanner;
import java.util.Locale;

public class ProgramSquare {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //Instanciando o objeto
        Square square = new Square();

        System.out.print("Enter the side of the square: ");
        // Capturando o valor digitado e jogando no atributo do objeto
        square.side = input.nextDouble();

        // Chamando o metodo para calcular a area
        double area = square.area();

        // Exibindo o resuldado
        System.out.println("The area of the square is: " + area);

        input.close();

    }

}
