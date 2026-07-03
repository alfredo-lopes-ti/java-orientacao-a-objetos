package _01_introducao_oo.school_students.application;

import _01_introducao_oo.school_students.entities.Student;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.setName(sc.nextLine());

        System.out.print("First trimester grade: ");
        student.setGrade1(sc.nextDouble());

        System.out.print("Second trimester grade: ");
        student.setGrade2(sc.nextDouble());

        System.out.print("Third trimester grade: ");
        student.setGrade3(sc.nextDouble());

        System.out.println();
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        // A aplicação apenas pergunta para a entidade o resultado, sem fazer cálculos na tela
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
