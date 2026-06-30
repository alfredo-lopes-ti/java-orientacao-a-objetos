# Collections em Java

## O que é Collections?

Collections é um conjunto de estruturas de dados prontas do Java para armazenar,
organizar e manipular grupos de objetos. Em vez de criar arrays manuais com tamanho
fixo, você usa estruturas que crescem, ordenam e buscam automaticamente.

O resultado de uma consulta SQL em Java vira uma `List` — por isso Collections é
pré-requisito direto para JDBC.

---

## Estruturas estudadas

| Estrutura | Característica | Uso típico |
|---|---|---|
| `ArrayList` | Lista ordenada, permite repetição, acesso por índice | Resultado de consultas SQL |
| `HashMap` | Chave → valor, busca rápida sem percorrer tudo | Cache, configurações, agrupamentos |

---

## Conceitos praticados

- `List<T>` e `ArrayList<T>` — listas com generics, aceitam apenas o tipo declarado
- `Map<K, V>` e `HashMap<K, V>` — estrutura de chave e valor
- `.add()`, `.get()`, `.remove()`, `.size()` — operações básicas de lista
- `.put()`, `.get()`, `.containsKey()` — operações básicas de mapa
- `Map.Entry` — percorrer um mapa acessando chave e valor ao mesmo tempo
- `putIfAbsent()` — evita sobrescrever uma chave já existente
- Generics (`<Produto>`, `<String, Integer>`) — o compilador garante o tipo correto em tempo de compilação

---

## Exercício principal — Sistema de Estoque

**Pacote:** `colecoes.market`

**Objetivo:** gerenciar produtos usando `ArrayList` para a lista geral e `HashMap`
como índice de busca rápida por ID, além de agrupar produtos por categoria.

### Arquivos

| Arquivo | Tipo | Descrição |
|---|---|---|
| `Produto.java` | Classe | Modelo de produto com id, nome, categoria, preço e estoque |
| `EstoqueService.java` | Classe | Lógica de negócio: adicionar, buscar, agrupar, remover |
| `MainEstoque.java` | veiculos.heranca.Main | Testa todas as operações |

### Por que ArrayList **e** HashMap juntos?

```java
private List<Produto> produtos = new ArrayList<>();        // lista completa, ordem de inserção
private Map<Integer, Produto> indicePorId = new HashMap<>(); // busca direta por ID
```

A lista guarda todos os produtos. O mapa serve como **índice** — ao buscar por ID,
não é necessário percorrer a lista inteira, o `HashMap` encontra direto:

```java
public Produto buscarPorId(int id) {
    return indicePorId.get(id); // acesso direto, sem loop
}
```

### Agrupamento com HashMap de listas

```java
public Map<String, List<Produto>> agruparPorCategoria() {
    Map<String, List<Produto>> grupos = new HashMap<>();
    for (Produto p : produtos) {
        grupos.putIfAbsent(p.getCategoria(), new ArrayList<>());
        grupos.get(p.getCategoria()).add(p);
    }
    return grupos;
}
```

`putIfAbsent` garante que uma lista nova só é criada na primeira vez que uma
categoria aparece — nas próximas, o produto é adicionado à lista já existente.

---

## Exercícios de consolidação

Depois do exercício principal, dois exercícios menores para fixar os conceitos
isoladamente, sem classes auxiliares:

| Arquivo | Foco |
|---|---|
| `MainPraticaListaClientes.java` | `ArrayList<String>` — adicionar, percorrer com `for`, remover por índice |
| `MainPraticaMapaIdades.java` | `HashMap<String, Integer>` — `put`, `get`, `containsKey` |

### Atenção: `get()` vs `containsKey()`

Buscar uma chave que não existe no mapa com `.get()` não gera erro — retorna `null`:

```java
Integer idade = idades.get("Diego"); // não existe → retorna null, sem exception
```

Isso é uma fonte comum de `NullPointerException` mais tarde, se o valor `null` for
usado sem verificação. Por isso `containsKey()` é mais seguro quando o objetivo é
apenas checar existência:

```java
boolean existe = idades.containsKey("Diego"); // retorna false, sem risco de null
```

---

## Resumo dos aprendizados

1. `ArrayList` mantém ordem de inserção e permite acesso por índice
2. `HashMap` permite busca direta por chave, sem percorrer a estrutura inteira
3. Generics (`<T>`) garantem que a estrutura só aceita o tipo declarado
4. Combinar `List` e `Map` para a mesma informação é comum: lista para iteração completa, mapa para busca rápida
5. `putIfAbsent` evita sobrescrever dados ao agrupar itens
6. `.get()` em chave inexistente retorna `null`; `.containsKey()` é mais seguro para apenas verificar existência