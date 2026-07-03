package _01_introducao_oo.company_employee.application;

import _01_introducao_oo.company_employee.entities.Employee;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //instanciando o objeto employee
        Employee employee = new Employee();
        System.out.print("");

        //solicitando as informações e armazenando os dados em "employee"
        System.out.print("Enter the name of the employee: ");
        employee.name = sc.nextLine();

        System.out.print("Enter the gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Enter the tax percentage: ");
        // USAR sc.next() resolve o problema do "Enter" pendente na memória
        String taxInput = sc.next();
        taxInput = taxInput.replace("%", "").trim();
        employee.tax = Double.parseDouble(taxInput);

        // com todos os dados salvos, é só mostrar ao funcionário
        System.out.println();
        System.out.println("Employee: " + employee);

        // Próximo passo: perguntar o aumento
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        // 1. Lemos como texto para aceitar o caractere "%"
        String percentageInput = sc.next();

        // 2. Removemos o "%" e espaços em branco
        percentageInput = percentageInput.replace("%", "").trim();

        // 3. Convertemos para double de forma segura
        double percentage = Double.parseDouble(percentageInput);

        // Executando o método da classe employee
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);

        sc.close();

    }
}

