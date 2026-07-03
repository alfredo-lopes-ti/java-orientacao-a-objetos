package _01_introducao_oo.area_retangulo.aplication;

import _01_introducao_oo.area_retangulo.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // 1. Instanciando o objeto rectangle
        Rectangle rectangle = new Rectangle();
        System.out.print("");

        // 2. Solicitando as informações ao usuario
        System.out.print("Enter rectangle width and height: ");
        double width = input.nextDouble();

        // 3. Envia os dados capturados para dentro do objeto encapsulado
        rectangle.setWidth(width);

        System.out.print("Enter rectangle length: ");
        double height = input.nextDouble();

        // 4. Envia os dados capturados para dentro do objeto encapsulado
        rectangle.setHeight(height);

        // 5. Exibe os resultados formatados com duas casas decimais
        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

        input.close();
    }
}
