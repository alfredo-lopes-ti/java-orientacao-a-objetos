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

O projeto segue a estrutura padrão do Maven (`src/main/java/`), organizada em módulos numerados por ordem de aprendizado. Abaixo estão os conceitos abordados em cada um:

| Módulo | Conceito Praticado |
| :--- | :--- |
| `📦 _01_introducao_oo` | Fundamentos de Programação Orientada a Objetos: classes, atributos, métodos e objetos. |
| `📦 _02_encapsulamento_construtores` | Modificadores de acesso (`private`, `public`, `protected`), Getters/Setters e construtores. |
| `📦 _03_memoria_arrays_listas` | Manipulação de estruturas de dados na prática (`List`, `Map`, coleções). |
| `📦 _04_tratamento_excecoes` | Tratamento de erros resiliente (`try-catch`), propagação (`throws`) e exceções customizadas. |
| `📦 _05_interfaces_polimorfismo` | Herança (`extends`), `super()`, `@Override`, classes abstratas, interfaces (`implements`) e polimorfismo. |
| `📦 _06_banco_de_dados_jdbc` | Integração com banco de dados relacional utilizando JDBC, automação de tabelas e operações de CRUD. |
| `📦 _07_poo_avancado_moderno` | Composição vs. herança, princípios SOLID, injeção de dependência, lambdas e Streams API *(em construção)*. |

---

## 🚀 Como Executar o Projeto Localmente

### Pré-requisitos
1. Ter o **JDK 17** (ou superior) instalado.
2. Ter o **Maven** configurado na sua máquina.
3. Ter uma instância do **MySQL** rodando localmente (necessária apenas para os exemplos do módulo `_06_banco_de_dados_jdbc`).

### Passos para Configuração
1. Clone o repositório:
   ```bash
   git clone https://github.com/alfredo-lopes-ti/java-pratica-conceitos.git
   ```
2. Entre na pasta do projeto:
   ```bash
   cd java-pratica-conceitos
   ```
3. Caso vá rodar os exemplos de JDBC, crie o schema no MySQL e ajuste usuário/senha em `FabricaConexao.java` (pasta `_06_banco_de_dados_jdbc/exercicio_fabrica`):
   ```java
   String url = "jdbc:mysql://localhost:3306/java-pratica-conceitos?useTimezone=true&serverTimezone=UTC";
   String usuario = "seu_usuario";
   String senha = "sua_senha";
   ```
4. Compile o projeto com Maven:
   ```bash
   mvn compile
   ```
5. Execute qualquer classe `Main`/`Program` diretamente pela sua IDE, ou via terminal, apontando para a classe desejada, por exemplo:
   ```bash
   java -cp target/classes _04_tratamento_excecoes.MainConta
   ```

---

## 📌 Sobre este repositório

Cada módulo é independente e contém exemplos comentados em português, explicando não só o código, mas o raciocínio por trás de cada conceito. A ideia é que o conteúdo sirva tanto para consulta rápida quanto para quem está aprendendo POO em Java pela primeira vez.
