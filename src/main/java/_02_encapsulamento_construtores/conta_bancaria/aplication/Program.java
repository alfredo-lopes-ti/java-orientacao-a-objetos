package _02_encapsulamento_construtores.conta_bancaria.aplication;

import java.util.Locale;
import java.util.Scanner;

import _02_encapsulamento_construtores.conta_bancaria.entities.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        // Enter account data
        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y' || response == 'Y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        // Secound deposit value
        System.out.println();
        System.out.println("Enter a deposit value");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account: ");
        System.out.println(account);

        // withdrawing money
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Update account value: ");
        System.out.println(account);

        sc.close();
    }

}
