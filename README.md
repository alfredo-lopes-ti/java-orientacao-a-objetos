# ☕ Java — Prática de Conceitos

Repositório dedicado ao estudo e à aplicação prática dos principais pilares e conceitos do ecossistema Java. O projeto foi evoluído de uma estrutura simples para um projeto gerenciado por **Maven** e integrado com banco de dados **MySQL**.

---

## 🛠️ Tecnologias e Ferramentas
* **Linguagem:** Java 17+
* **Gerenciador de Dependências:** Maven
* **Banco de Dados:** MySQL (via JDBC)
* **IDE:** IntelliJ IDEA

---

## 📂 Organização do Repositório

O projeto segue a estrutura padrão do Maven (`src/main/java/`). Abaixo estão os conceitos abordados em cada pacote:

| Pacote | Conceito Praticado |
| :--- | :--- |
| `📦 heranca` | Herança de classes (`extends`), uso de `super()`, sobrescrita (`@Override`) e Polimorfismo. |
| `📦 classes_abstratas` | Classes moldes (`abstract`) e a obrigatoriedade de contratos com métodos abstratos. |
| `📦 encapsulamento` | Modificadores de acesso (`private`, `public`, `protected`) e métodos Getters/Setters. |
| `📦 interfaces` | Contratos de comportamento múltiplos (`interface` e `implements`). |
| `📦 colecoes` | Manipulação de estruturas de dados na prática (`List`, `Map`, `Set`). |
| `📦 exceptions` | Tratamento de erros resiliente (`try-catch`), propagação (`throws`) e exceções customizadas. |
| `📦 database` | Integração com banco de dados relacional utilizando JDBC, automação de tabelas e operações de CRUD. |
| `📦 enum` | Uso de enumerações para padronização de dados constantes. |
| `📦 generics` | Reaproveitamento e segurança de tipos em classes e métodos reutilizáveis. |
| `📦 lambda-streams` | Programação funcional, expressões lambda e manipulação declarativa de coleções com a Streams API. |

---

## 🚀 Como Executar o Projeto Localmente

### Pré-requisitos
1. Ter o **JDK 17** (ou superior) instalado.
2. Ter o **Maven** configurado na sua máquina.
3. Ter uma instância do **MySQL** rodando localmente.

### Passos para Configuração
1. Clone o repositório:
   ```bash
   git clone [https://github.com/alfredo-lopes-ti/java-pratica-conceitos.git](https://github.com/alfredo-lopes-ti/java-pratica-conceitos.git)