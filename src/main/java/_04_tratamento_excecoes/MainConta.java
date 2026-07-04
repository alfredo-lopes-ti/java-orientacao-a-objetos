package _04_tratamento_excecoes;

public class MainConta {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Alfredo", "123456", 1000);
        ContaBancaria conta2 = new ContaBancaria("Carlos", "654321", 500);

        System.out.println("=== Saldo Inicial ===");
        conta1.exibirSaldo();
        conta2.exibirSaldo();

        // --- Operações Normais ---
        System.out.println();
        System.out.println("=== Operações Normais ===");
        try {
            conta1.sacar(200);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Saldo Atualizado ===");
        conta1.exibirSaldo();
        conta2.exibirSaldo();

        // --- Testando a exception customizada ---
        System.out.println();
        System.out.println("=== Testando proteções ===");

        // Cenário 1: saque maior que saldo
        try {
            conta2.sacar(9999.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Bloqueado: " + e.getMessage());
            System.out.printf("Faltam R$ %.2f para completar a operação.%n",
                    e.getValorSolicitado() - e.getSaldoAtual());
        }
            // Cenário 2: transferência impossível
            System.out.println();
            try {
                conta2.transferir(conta1, 5000.00);
            } catch (SaldoInsuficienteException e) {
                System.out.println("Transferência bloqueada: " + e.getMessage());
            }

            // Cenário 3: valor inválido (unchecked — IllegalArgumentException)
            System.out.println();
            try {
                conta1.depositar(-100);
                } catch (IllegalArgumentException e) {
                System.out.println("Erro: Valor invalido " + e.getMessage());
            }

            System.out.println();
            System.out.println("=== Saldo Atualizado (final) ===");
            conta1.exibirSaldo();
            conta2.exibirSaldo();

        }
    }
