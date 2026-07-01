package interfaces.pagamento;

// "implements" é a palavra usada com interfaces
// (diferente de "extends" que usamos com classes)
public class PagamentoPix implements Pagavel {

    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    // O @Override significa que estamos "cumprindo o contrato"
    // Implementando o que a interface exigiu
    @Override
    public void  realizarPagamento(double valor) {
        System.out.println("Pagamento via Pix realizado com sucesso!");
        System.out.println("Chave Pix: " + chavePix);
        System.out.println("Valor: " + valor);
    }

    @Override
    public String getDescricao() {
        return "Pix - Chave: " + chavePix;
    }

}
