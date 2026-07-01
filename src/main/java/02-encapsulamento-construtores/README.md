# Encapsulamento em Java

## O que é encapsulamento?

Encapsulamento é o princípio de **proteger os dados de uma classe**, controlando como
eles são lidos e modificados. Em vez de expor os atributos diretamente, a classe oferece
métodos controlados que validam qualquer alteração antes de aceitá-la.

Em uma frase: *os dados ficam privados, o acesso fica público e controlado.*

---

## Por que isso importa?

Sem encapsulamento, qualquer parte do sistema pode atribuir valores inválidos:

```java
// Sem encapsulamento — o Java aceita, mas o sistema vai quebrar lá na frente
produto.preco = -500;
produto.estoque = -99;
produto.nome = "";
```

O problema não aparece na hora da atribuição — aparece muito depois, numa consulta,
num relatório ou numa nota fiscal. Difícil de rastrear, caro de corrigir.

Com encapsulamento, o erro é bloqueado na origem, com uma mensagem clara.

---

## Conceitos praticados

- `private` — impede acesso direto ao atributo de fora da classe
- **Getters** — métodos públicos de leitura (`getNome()`, `getPreco()`)
- **Setters** — métodos públicos de escrita com validação (`setPreco()`, `setEstoque()`)
- Construtor chamando setters — garante validação já na criação do objeto
- `IllegalArgumentException` — exceção lançada quando um valor inválido é rejeitado
- Comportamentos protegidos — métodos como `vender()` e `repor()` que alteram dados
  internos com regras de negócio

---

## Exercício — Controle de Estoque

**Pacote:** `encapsulamento`

**Objetivo:** modelar um produto de loja com atributos protegidos e regras de negócio
que impedem valores inválidos e operações impossíveis (vender mais do que há em estoque,
repor quantidade zero, definir preço negativo).

### Arquivos

| Arquivo | Tipo | Descrição |
|---|---|---|
| `Produto.java` | Classe | Produto com atributos privados, getters, setters e comportamentos |
| `MainProduto.java` | veiculos.heranca.Main | Testa movimentações válidas e tentativas de valores inválidos |

### Estrutura da classe Produto

```java
// Atributos privados — ninguém acessa diretamente
private String nome;
private double preco;
private int estoque;

// Setter com validação — a proteção fica aqui
public void setPreco(double preco) {
    if (preco < 0) {
        throw new IllegalArgumentException("Preço não pode ser negativo.");
    }
    this.preco = preco;
}

// Comportamento com regra de negócio
public void vender(int quantidade) {
    if (quantidade > estoque) {
        throw new IllegalArgumentException("Estoque insuficiente. Disponível: " + estoque);
    }
    this.estoque -= quantidade;
}
```

### Conceito-chave demonstrado

O construtor chama os próprios setters em vez de atribuir os valores diretamente.
Isso garante que **um objeto inválido nunca chega a existir**:

```java
public Produto(String nome, double preco, int estoque) {
    setNome(nome);    // já valida no momento da criação
    setPreco(preco);
    setEstoque(estoque);
}
```

---

## Regras de negócio implementadas

| Operação | Regra |
|---|---|
| `setNome()` | Nome não pode ser nulo ou vazio |
| `setPreco()` | Preço não pode ser negativo |
| `setEstoque()` | Estoque não pode ser negativo |
| `vender()` | Quantidade deve ser maior que zero e não pode superar o estoque |
| `repor()` | Quantidade deve ser maior que zero |

---

## Resumo dos aprendizados

1. Atributos `private` impedem modificação direta de fora da classe
2. Getters expõem leitura sem risco
3. Setters centralizam a validação — um único lugar para corrigir uma regra
4. O construtor deve usar os setters para garantir que objetos nasçam válidos
5. Comportamentos (`vender`, `repor`) encapsulam regras de negócio junto com os dados
6. Mensagens de erro claras economizam tempo de suporte em sistemas reais
