package _02_encapsulamento_construtores.conta_bancaria.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();

        String holder = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        System.out.println("Enter initial deposit value: ");
        double initialDeposit = 0.0;

        if (response == 'y' || response == 'Y') {
            initialDeposit = sc.nextDouble();
        }

        System.out.println("Account data: " + number + ", " + holder + ", " + initialDeposit);

        System.out.println("Enter a deposit value: ");
        double depositValue = initialDeposit + sc.nextDouble();
        System.out.println("New balance: " + depositValue);

        System.out.println("Account data: " + number + ", " + holder + ", " + depositValue);

        System.out.println("Enter a withdraw value: ");
        double withdrawValue = depositValue - sc.nextDouble() - 5.0; // Taxa de saque de R$5,00
        System.out.println("New balance: " + withdrawValue);

        System.out.println("Account data: " + number + ", " + holder + ", " + withdrawValue);

        sc.close();
    }

}
