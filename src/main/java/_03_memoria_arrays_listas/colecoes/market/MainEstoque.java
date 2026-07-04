package _03_memoria_arrays_listas.colecoes.market;

import java.util.List;
import java.util.Map;

public class MainEstoque {

    public static void main(String[] args){

        EstoqueService estoque = new EstoqueService();

        // --- Adicionando produtos
        System.out.println("===Cadastro de Produtos===");
        estoque.adicionar(new Produto(1, "Notebook Dell", "Informática", 3500.00, 10));
        estoque.adicionar(new Produto(2, "Mouse Logitech", "Informática", 150.00, 23));
        estoque.adicionar(new Produto(3, "Monitor LG", "Informática", 5600.00, 50));
        estoque.adicionar(new Produto(4, "Cadeira Gamer", "Mobiliário", 1800.00, 15));
        estoque.adicionar(new Produto(5, "Mesa de Escritório", "Mobiliário", 900.00, 35));
        estoque.adicionar(new Produto(6, "Headset HyperX", "Informática", 350.00, 10));

        // --- Listando todos ---
        System.out.println();
        System.out.println("===Todos os Produtos===");
        estoque.listarTodos();
        System.out.println("Total: " + estoque.totalProdutos() + " produtos");

        // --- Busca por ID (HashMap — direto) ---
        System.out.println();
        System.out.println("===Busca por ID===");
        Produto encontrado = estoque.buscarPorId(3);
        if (encontrado != null) {
            System.out.println("Encontrado " + encontrado);
        }else{
            System.out.println("Produto não encontrado");
        }

        // --- Busca por nome (ArrayList — percorre a lista) ---
        System.out.println();
        System.out.println("=== Busca por Nome: 'log' ===");
        List<Produto> resultado = estoque.buscarPorNome("log");
        for (Produto p : resultado) {
            System.out.println(p);
        }

        // --- Agrupamento por categoria (HashMap de listas) ---
        System.out.println();
        System.out.println("=== Produtos por Categoria ===");
        Map<String, List<Produto>> grupos = estoque.agruparPorCategoria();
        for (Map.Entry<String, List<Produto>> entrada : grupos.entrySet()) {
            System.out.println(">> " + entrada.getKey());
            for (Produto p : entrada.getValue()) {
                System.out.println("   " + p);
            }
        }

        // --- Removendo um produto ---
        System.out.println();
        System.out.println("=== Remoção ===");
        estoque.remover(2);
        estoque.remover(99);

        System.out.println();
        System.out.println("=== Estoque Final ===");
        estoque.listarTodos();
        System.out.println("Total: " + estoque.totalProdutos() + " produtos");

    }

}
