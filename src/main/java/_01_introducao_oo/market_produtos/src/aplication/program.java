package aplication;

import entities.product;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        product product = new product();

        // Leitura dos dados do produto
        System.out.println("Enter product details: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        product.totalValueInStock();

        System.out.println();
        //System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        System.out.println("Product details: " + product);

        // Atualizando a quantidade dentro do objeto product
        System.out.println();
        System.out.println("Enter the numbers of the products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        // Mostrando a atualização do produto
        System.out.println("Update details: " + product);

        // Removendo quantidade do objeto product
        System.out.println();
        System.out.println("Enter the numbers of the products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        // Mostrando a atualização do produto
        System.out.println("Update details: " + product);

        sc.close();
    }
}
