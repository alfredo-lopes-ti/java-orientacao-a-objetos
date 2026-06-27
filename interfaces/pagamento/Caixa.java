package interfaces.pagamento;

public class Caixa {

    // O parametro é do tipo Pagavel (a interface)
    // Isso significa que aceita qualquer classe que implemente Pagavel
    // Pix, Catão, Boleto, CriptoMoeda... tanto faz
    // O Caixa não sabe e bão precisa saber qual é

    public void processarPagamento(Pagavel pagamento, double valor) {
        System.out.println("Caixa processando pagamento...");
        System.out.println("Escolha a forma de pagamento: " + pagamento.getDescricao());
        pagamento.realizarPagamento(valor);
        System.out.println("Pagamento processado com sucesso!");
        System.out.println("-------------------------------------------------");
    }


}
