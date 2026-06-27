package interfaces.pagamento;

public class MainPagamento {

    public static void main(String[] args) {

        // Criando diferentes formas de pagamento (Polimorfismo com Interfaces)
        // A variável é do tipo "Pagavel" (a interface)
        // mas o objeto pode ser qualquer classe que implemente ela
        Pagavel pix = new PagamentoPix("alfredo@email.com");
        Pagavel cartao = new PagamentoCartao("1234-5678-9012-3456", 3);
        Pagavel boleto = new PagamentoBoleto("1234567890123456789012345678901");

        System.out.println("--- Processando Pagamentos ---");
        System.out.println();

        // Chamammos o mesmo metodo nos dois objetos
        // Cada um responde do seu jeito - isso é poimorfismo

        // Foi criado Caixa, ele não sabe nada sobre Pix ou Cartão
        // O caixa só sabe trabalhar com Pagavel
        Caixa caixa = new Caixa();

        // Passamos qualquer Pagavel para o caixa processar
        caixa.processarPagamento(pix, 100.0);
        caixa.processarPagamento(cartao, 200.0);
        caixa.processarPagamento(boleto, 300.0);

    }

}
