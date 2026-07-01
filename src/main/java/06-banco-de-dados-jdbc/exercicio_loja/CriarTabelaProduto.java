package database.exercicio_loja;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import database.exercicio_fabrica.FabricaConexao; // Importamos a fábrica que está na pasta exercicio_fabrica

import javax.swing.*;

public class CriarTabelaProduto {
    public static void main(String[] args) {
        // Escrevemos o comando na lingua do MySQL para criar a tabela de produtos
        String sql = "CREATE TABLE IF NOT EXISTS produtos ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "nome VARCHAR(100) NOT NULL,"
                + "preco DECIMAL(10, 2) NOT NULL,"
                + "quantidade INT NOT NULL"
                + ")";

        // 2. Abrimos a conexão usando o Try-with-resources (fecha sozinho no final!)
        try (Connection conexao = FabricaConexao.getConexao();
            Statement stmt = conexao.createStatement()) {

                // Mandamos o comando para o MySQL executar
                stmt.execute(sql);
                System.out.println("Tabela 'Produtos' criada com sucesso!");

            } catch (SQLException e) {
                System.out.println("Erro ao criar tabela 'Produtos'! " + e.getMessage());
            }
        }
    }


