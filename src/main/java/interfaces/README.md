# Interfaces em Java

## O que é uma interface?

Uma interface é um **contrato**. Ela define *o que* uma classe deve ser capaz de fazer,
sem dizer *como* fazer. Qualquer classe que assinar esse contrato é obrigada a implementar
todos os métodos declarados na interface.

Diferença fundamental em relação à classe abstrata:

| | Classe Abstrata | Interface |
|---|---|---|
| Palavra-chave | `extends` | `implements` |
| Pode ter código pronto? | Sim | Não (apenas assinaturas) |
| Quantas por classe? | Apenas uma | Várias ao mesmo tempo |
| Representa | Uma hierarquia familiar | Um contrato independente |

---

## Conceitos praticados

- `interface` — declara o contrato com assinaturas de métodos
- `implements` — classe assumindo o compromisso de cumprir o contrato
- `@Override` — marcação obrigatória ao implementar cada método
- Polimorfismo via interface — variável do tipo da interface que aceita qualquer implementação
- Múltiplas interfaces — uma classe implementando dois contratos ao mesmo tempo
- Array de interface — guardar objetos de tipos diferentes sob o mesmo contrato

---

## Exercício 1 — Sistema de Pagamentos

**Pacote:** `interfaces.pagamento`

**Objetivo:** modelar diferentes formas de pagamento (Pix, Cartão, Boleto) que compartilham
o mesmo contrato, permitindo que um `Caixa` processe qualquer uma delas sem precisar
saber qual é.

### Arquivos

| Arquivo | Tipo | Descrição |
|---|---|---|
| `Pagavel.java` | Interface | Contrato com `realizarPagamento()` e `getDescricao()` |
| `PagamentoPix.java` | Classe | Implementa `Pagavel` com chave Pix |
| `PagamentoCartao.java` | Classe | Implementa `Pagavel` com parcelamento |
| `PagamentoBoleto.java` | Classe | Implementa `Pagavel` com código de barras |
| `Caixa.java` | Classe | Processa qualquer `Pagavel` sem conhecer o tipo concreto |
| `MainPagamento.java` | veiculos.heranca.Main | Testa o fluxo completo |

### Conceito-chave demonstrado

O método `processarPagamento(Pagavel pagamento, double valor)` da classe `Caixa`
recebe a **interface como parâmetro** — não o tipo concreto. Isso significa que qualquer
nova forma de pagamento criada no futuro (ex: criptomoeda) é processada automaticamente,
sem alterar o `Caixa`. Esse é o **Princípio Aberto/Fechado**: aberto para crescer,
fechado para modificação.

---

## Exercício 2 — Sistema de Funcionários

**Pacote:** `interfaces.funcionarios`

**Objetivo:** demonstrar que uma classe pode implementar múltiplas interfaces ao mesmo
tempo — algo impossível com herança, mas natural com interfaces.

### Arquivos

| Arquivo | Tipo | Descrição |
|---|---|---|
| `Autenticavel.java` | Interface | Contrato com `autenticar()` e `getNome()` |
| `Gerenciavel.java` | Interface | Contrato com `promover()` e `calcularBonus()` |
| `Funcionario.java` | Classe | Implementa apenas `Autenticavel` |
| `Gerente.java` | Classe | Implementa `Autenticavel` **e** `Gerenciavel` |
| `MainFuncionario.java` | veiculos.heranca.Main | Testa autenticação, promoção e array de interface |

### Conceito-chave demonstrado

```java
// Funcionario e Gerente são classes diferentes
// mas os dois cumprem o contrato Autenticavel
// então podem ser guardados juntos no mesmo array
Autenticavel[] usuarios = { func, ger };

for (Autenticavel u : usuarios) {
    System.out.println(u.getNome() + ": " + u.autenticar("senha123"));
}
```

O sistema de RH enxerga apenas `Autenticavel` — não importa se é funcionário ou gerente.
Cada objeto responde do seu jeito ao mesmo método. Isso é **polimorfismo**.

---

## Resumo dos aprendizados

1. Interface define *o que*, a classe define *o como*
2. `implements` pode receber múltiplas interfaces separadas por vírgula
3. Uma variável do tipo da interface aceita qualquer classe que a implemente
4. Passar a interface como parâmetro de método desacopla quem chama de quem executa
<<<<<<< HEAD
5. Arrays e listas de interface permitem tratar objetos diferentes de forma uniforme
=======
5. Arrays e listas de interface permitem tratar objetos diferentes de forma uniforme
>>>>>>> 82a22922d7db6944ed3009a1e4d1b00967b0c0c6
