package _04_tratamento_excecoes;

public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        }

        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // "throws" avisa quem chamar esse metodo:
    // "Atenção esse metodo pode lançar SaldoInsuficienteException"
    // Quem usar é obrigado a usar "try/catch"
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("O seu saldo deve ser maior que zero");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException(saldo, valor);
        }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado. Novo saldo: R$ %.2f%n", valor, saldo);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do deposito deve ser maior que zero");
        }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado. Novo saldo: R$ %.2f%n", valor, saldo);
    }

    // throws em cadeia — transferir depende de sacar, que pode lançar exception
    public void transferir(ContaBancaria destino, double valor) throws  SaldoInsuficienteException {
        System.out.printf("Iniciando transferência de R$ %.2f para %s...%n", valor, destino.titular);
        this.sacar(valor); // se falhar aqui o deposito não acontece
        destino.depositar(valor); // só executa se o saque funcionou
        System.out.println("Transferencia realizada com sucesso!");
    }

    public void exibirSaldo() {
        System.out.printf("Conta %s | Titular: %-15s | Saldo: R$ %.2f%n",
                numeroConta, titular, saldo);
    }
}
