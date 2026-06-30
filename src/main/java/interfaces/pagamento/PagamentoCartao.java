package interfaces.pagamento;

public class PagamentoCartao implements Pagavel{

    private String numeroCartao;
    private int parcelas;

    public PagamentoCartao(String numeroCartao, int parcelas) {
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void realizarPagamento(double valor) {
        double valorParcela = valor / parcelas;
        System.out.println("Pagamento via cartão realizado com sucesso!");
        System.out.println("Cartão: " + numeroCartao);
        System.out.println("Valor total: " + valor);
        System.out.printf("Em %dx de R$ %.2f%n", parcelas, valorParcela);
    }

    @Override
    public String getDescricao() {
        return "Cartão de crédito - " + parcelas + " parcelas";
    }
}
