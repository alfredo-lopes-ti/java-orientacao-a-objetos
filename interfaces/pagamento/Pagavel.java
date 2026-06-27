package interfaces.pagamento;

// A palavra "interface" substitui "class"
// Não é uma classe, é um contrato puro
public interface Pagavel {

    // Métodos de interfaces não tem corpo (sem {})
    // Toda classe que implementar esta interface
    // Obrigatoriamente precisa criar esses dois métodos
    // Não há public nos métodos porque em interfaces todos já são públicos por padrão
    // lista de obrigações: "quem quiser ser Pagavel, precisa saber fazer
    void realizarPagamento(double valor);
    String getDescricao();

}
