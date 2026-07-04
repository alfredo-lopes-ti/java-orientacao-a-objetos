package _03_memoria_arrays_listas.colecoes.market;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstoqueService {

    // ArrayList — lista de produtos (cresce automaticamente)
    private List<Produto> produtos = new ArrayList<>();

    // HashMap — índice rápido: id do produto → produto
    private Map<Integer, Produto> indicePorId = new HashMap<>();

    // --- Adicionar ---
    public void adicionar(Produto produto) {
        produtos.add(produto);
        indicePorId.put(produto.getId(), produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    // --- Buscar por ID usando o HashMap (busca direta, sem percorrer a lista) ---
    public Produto buscarPorId(int id) {
        return indicePorId.get(id); // retorna null se não encontrar
    }

    // --- Buscar por nome percorrendo a lista ---
    public List<Produto> buscarPorNome(String termo) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getNome().toLowerCase().contains(termo.toLowerCase())) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // --- Listar por categoria usando HashMap de listas ---
    public Map<String, List<Produto>> agruparPorCategoria() {
        Map<String, List<Produto>> grupos = new HashMap<>();
        for (Produto p : produtos) {
            // se a categoria ainda não existe no mapa, cria uma lista vazia
            grupos.putIfAbsent(p.getCategoria(), new ArrayList<>());
            grupos.get(p.getCategoria()).add(p);
        }
        return grupos;
    }

    // --- Remover por ID ---
    public boolean remover(int id) {
        Produto produto = indicePorId.remove(id);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto removido: " + produto.getNome());
            return true;
        }
        System.out.println("Produto ID " + id + " não encontrado.");
        return false;
    }

    // --- Listar todos ---
    public void listarTodos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (Produto p : produtos) {
            System.out.println(p); // chama o toString() automaticamente
        }
    }

    public int totalProdutos() {
        return produtos.size();
    }

}