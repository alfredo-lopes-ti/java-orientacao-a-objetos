package _02_encapsulamento_construtores.produto_1;

public class Produto {

    // Atributos privados, ninguém de fora acessa diretamente
    private String nome;
    private double preco;
    private int estoque;

    // Construtor padrão
    public Produto(String nome, double preco, int estoque) {
        setNome(nome); // chama o ‘setter’
        setPreco(preco);
        setEstoque(estoque);
    }

    // ===== GETTERS — só leitura, sem validação necessária =====
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;

    }

    // ===== SETTERS — a proteção fica aqui =====
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero");
        }
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        if (estoque < 0) {
            throw new IllegalArgumentException("Estoque não pode ser negativo");
        }
        this.estoque = estoque;
    }

    // ===== COMPORTAMENTOS — lógica que envolve os dados =====

    // Vender diminui o estoque - mas só se tiver saldo
    public void vender(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
        if (quantidade > estoque) {
            throw new IllegalArgumentException("Quantidade em estoque insuficiente");
        }
        this.estoque -= quantidade;
        System.out.println("Venda realizada com sucesso!");
        System.out.println("Quantidade vendida: " + quantidade);
        System.out.println("Estoque atual: " + estoque);
    }

    // Repor aumenta o estoque
    public void repor(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
        this.estoque += quantidade;
        System.out.println("Repor realizado com sucesso!");
        System.out.println("Quantidade reporada: " + quantidade);
        System.out.println("Estoque atual: " + estoque);
    }
    public void exibirInfo() {
        System.out.printf("Produto: %-20s | Preço: R$ %7.2f | Estoque: %d%n",
                nome, preco, estoque);
    }
}
