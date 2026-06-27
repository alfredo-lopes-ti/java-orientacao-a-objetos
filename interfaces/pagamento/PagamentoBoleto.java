package interfaces.pagamento;

public class PagamentoBoleto implements Pagavel{
    String codigoBarras;

    public PagamentoBoleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

@Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento via boleto realizado com sucesso! " + codigoBarras);
        System.out.println("Valor: " + valor);
        System.out.println("O boleto vence em 3 dias!");
    }
    @Override
    public String getDescricao() {
        return "Boleto - Código: " + codigoBarras;
    }
}
