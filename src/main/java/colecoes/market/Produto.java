package colecoes.market;

public class Produto {

    private int id;
    private String nome;
    private String categoria;
    private double preco;
    private int estoque;
    private boolean ativo;

    // Construtor padrão

    public Produto(int id, String nome, String categoria, double preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }
    public void setEstoque(int estoque) { this.estoque = estoque; }

    @Override
    public String toString() {
        return String.format("[%d] %-20s | %s | R$ %7.2f | Estoque: %d",
                id, nome, categoria, preco, estoque);
    }

}