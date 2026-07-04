package _02_encapsulamento_construtores.produto;

public class MainProduto {
    public static void main(String[] args) {

        //Criando produtos validos
        Produto p1 = new Produto("Notebook Dell", 3500.00, 10);
        Produto p2 = new Produto("Mouse Logitech", 150.00, 20);
        Produto p3 = new Produto("Monitor LG", 5600.00, 5);
        Produto p4 = new Produto("Teclado Rx", 120.00, 40);

        //Criando produtos invalidos
        System.out.println("=== Estoque Inicial ===");
        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();
        p4.exibirInfo();

        System.out.println();
        System.out.println("=== Movimentações ===");
        p1.vender(3);
        System.out.println();
        p2.vender(20);
        System.out.println();
        p3.repor(5);
        System.out.println();
        p4.repor(10);

        System.out.println();
        System.out.println("=== Estoque Final ===");
        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();
        p4.exibirInfo();

        System.out.println();
        System.out.println("=== Testando Proteção ===");
        // Tenta alterar o preço para negativo — vai lançar exceção
        try {
            p1.setPreco(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        // Tenta vender maos doque tem no estoque — vai lançar exceção
        try {
            p1.setEstoque(999);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        // Tenta repor com quantidade negativa — vai lançar exceção
        try {
            p1.setEstoque(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

