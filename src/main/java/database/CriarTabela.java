package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {
    public static void main(String[] args) {
        try (Connection conexao = FabricaConexao.getConexao()) {

            String sql = "CREATE TABLE IF NOT EXISTS usuarios ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(100) NOT NULL,"
                    + "email VARCHAR(100) NOT NULL UNIQUE"
                    + ")";

            Statement stmt = conexao.createStatement();
            stmt.execute(sql);

            System.out.println("Tabela 'usuarios' criada com sucesso ou ja existente!");

        } catch (SQLException e) {
            System.err.println("Erro na execucao do SQL: " + e.getMessage());
        }
    }
}
