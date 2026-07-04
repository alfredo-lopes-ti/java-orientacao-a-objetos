package _04_tratamento_excecoes;

// Estende Exception - isso a torna "checked exception"
// ou seja, quem chamar o metodo que lança essa exception
// É obrigado a tratar com try/catch
public class SaldoInsuficienteException extends Exception{

        private double saldoAtual;
        private double valorSolicitado;

        public SaldoInsuficienteException(double saldoAtual, double valorSolicitado) {
            // A mensagem vai aparecer no e.getMessage()
            super("Saldo insuficiente. Saldo atual: " + saldoAtual
                    + " | valor solicitado: " + valorSolicitado);
                    this.saldoAtual = saldoAtual;
                    this.valorSolicitado = valorSolicitado;
        }

        public double getSaldoAtual() {
            return saldoAtual;
        }
        public double getValorSolicitado() {
            return valorSolicitado;
        }
    }

