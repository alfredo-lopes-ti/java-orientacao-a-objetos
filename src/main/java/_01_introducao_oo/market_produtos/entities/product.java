package _01_introducao_oo.market_produtos.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        // o "this.quantity", para acessar o atributo da classe, e não o parametro que chegou na função
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    // Sobreposição da operação toString que já vem no object
    public String toString() {
        return "Product Name: " + name
                + ", Price: $ "
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity + ", Total Value: $ "
                + String.format("%.2f", totalValueInStock());
    }

}