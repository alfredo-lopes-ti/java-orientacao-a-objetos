# Exceptions em Java

## O que é uma Exception?

Exception é um evento inesperado que interrompe o fluxo normal do programa.
Em vez de o sistema travar sem explicação, o Java permite *capturar* esse evento,
tratar o problema e decidir o que fazer — exibir uma mensagem clara, registrar o erro
em log, ou tentar uma operação alternativa.

---

## Dois tipos de Exception

| Tipo | Característica | Exemplos |
|---|---|---|
| **Unchecked** | Opcional tratar — erro de lógica do programador | `IllegalArgumentException`, `NullPointerException` |
| **Checked** | Obrigatório tratar — o compilador exige `try/catch` | `IOException`, `SQLException` |

As **checked exceptions** são as mais importantes para banco de dados —
toda conexão com SQL em Java lança `SQLException`, e o compilador não compila
sem tratamento.

---

## Conceitos praticados

- `throws` na assinatura do método — avisa quem chama que o método pode falhar
- `throw new` — dispara a exception em um ponto específico do código
- `try/catch` — captura o erro e decide o que fazer
- Exception customizada — classe própria que estende `Exception`, carregando dados específicos do erro
- Cadeia de operações protegida — se uma etapa falha, as seguintes não executam
- Variável `e` por escopo — cada bloco `catch` tem seu próprio `e`, não podem se repetir no mesmo nível

---

## Exercício — Conta Bancária

**Pacote:** `exceptions`

**Objetivo:** modelar uma conta bancária com operações de saque, depósito e transferência,
onde falhas são comunicadas por uma exception customizada que carrega informações
detalhadas sobre o erro — saldo atual e valor solicitado.

### Arquivos

| Arquivo | Tipo | Descrição |
|---|---|---|
| `SaldoInsuficienteException.java` | Exception customizada | Estende `Exception`, carrega `saldoAtual` e `valorSolicitado` |
| `ContaBancaria.java` | Classe | Operações bancárias com `throws SaldoInsuficienteException` |
| `MainConta.java` | veiculos.heranca.Main | Testa operações válidas e cenários de erro |

---

## Exception customizada

Em sistemas corporativos, exceptions genéricas como `Exception("erro")` são pouco úteis.
Uma exception customizada carrega dados específicos que permitem um tratamento mais preciso:

```java
public class SaldoInsuficienteException extends Exception {

    private double saldoAtual;
    private double valorSolicitado;

    public SaldoInsuficienteException(double saldoAtual, double valorSolicitado) {
        super("Saldo insuficiente. Saldo atual: R$ " + saldoAtual
                + " | Valor solicitado: R$ " + valorSolicitado);
        this.saldoAtual = saldoAtual;
        this.valorSolicitado = valorSolicitado;
    }

}
```

No `catch`, é possível usar esses dados para calcular quanto falta, registrar em log
ou exibir uma mensagem personalizada ao usuário:

```java
} catch (SaldoInsuficienteException e) {
    System.out.println("Bloqueado: " + e.getMessage());
    System.out.printf("Faltam R$ %.2f para completar a operação.%n",
            e.getValorSolicitado() - e.getSaldoAtual());
}
```

---

## Cadeia de operações protegida

O método `transferir()` depende de `sacar()`, que pode lançar exception.
Se o saque falhar, o depósito não acontece — o dinheiro não some:

```java
public void transferir(ContaBancaria destino, double valor)
        throws SaldoInsuficienteException {
    this.sacar(valor);        // se falhar aqui, lança exception
    destino.depositar(valor); // só executa se o saque funcionou
}
```

---

## Erro aprendido na prática

Declarar a variável `e` duas vezes no mesmo escopo causa erro de compilação:

```java
// ERRADO — "e" duplicado no mesmo bloco
} catch (SaldoInsuficienteException e) {
    try {
        ...
    } catch (SaldoInsuficienteException e) { // ← erro aqui
    }
}

// CORRETO — cada try/catch no mesmo nível, independente
} catch (SaldoInsuficienteException e) {
    ...
}

try {
    ...
} catch (SaldoInsuficienteException e) { // ← e próprio, sem conflito
    ...
}
```

---

## Resumo dos aprendizados

1. `throws` na assinatura obriga quem chama a tratar o erro — padrão do JDBC
2. `throw new` dispara a exception no ponto exato onde o problema ocorre
3. Exception customizada carrega dados do erro além da mensagem de texto
4. Cada bloco `catch` tem seu próprio escopo — variável `e` não pode se repetir no mesmo nível
5. Em uma cadeia de operações, a exception interrompe tudo que viria depois
6. Checked exceptions são obrigatórias — o compilador não deixa passar sem tratamento