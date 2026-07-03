package _01_introducao_oo.area_triangulo.aplication;

import _01_introducao_oo.area_triangulo.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTriangle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //double xA, xB, xC, yA, yB, yC;

        // Instanciando objetos
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        // Solicitando os dados do triangulo x
        System.out.println("Enter the measures of triangle X: ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();

        // Solicitando os dados do triangulo y
        System.out.println("Enter the measures of triangle Y: ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        // Recebe o resultado quando o ojeto x/y executar o metodo area
        double areaX = x.area();
        double areaY = y.area();

        // Mostrando os recultados das áreas para o usuario
        System.out.printf("The area of triangle X is: %.4f\n", areaX);
        System.out.printf("The area of triangle Y is: %.4f\n", areaY);

        /*double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC)); */

        // Comparando qual área é maior
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else if (areaY > areaX) {
                System.out.println("Larger area: Y");
        } else {
            System.out.println("The areas are the same");
        }

        input.close();
    }
}
