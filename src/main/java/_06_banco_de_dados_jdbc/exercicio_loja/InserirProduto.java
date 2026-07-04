package _06_banco_de_dados_jdbc.exercicio_loja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import _06_banco_de_dados_jdbc.exercicio_fabrica.FabricaConexao;

public class InserirProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pegamos os dados do produto via teclado
        System.out.println("Digite o nome do produto: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o valor do produto: ");
        float valor = entrada.nextFloat();

        System.out.println("Digite o quantidade do produto: ");
        int quantidade = entrada.nextInt();

        // Preparamos o comando SQL com as interrogações para cada valor
        String sql = "INSERT INTO produtos (nome, valor, quantidade) VALUES (?, ?, ?)";

        // Abrimos a conexão e o mensageiro dentro do try-with-resources
        try (Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql)){

            // Preenchemos as intrrogações na ordem correta
            stmt.setString(1, nome);
            stmt.setDouble(2, valor);
            stmt.setInt(3, quantidade);

            // Mandamos o MySQL executar a inserção
            stmt.execute();
            System.out.println("Produto '" + nome + "' adicionado com sucesso!");
        } catch(SQLException e){
            System.out.println("Erro ao criar tabela 'Produtos'! " + e.getMessage());
        }
        entrada.close();
    }
}