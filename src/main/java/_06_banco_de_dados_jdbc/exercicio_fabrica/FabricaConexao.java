package _06_banco_de_dados_jdbc.exercicio_fabrica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao() {
        // Altere 'nome_do_seu_banco' para o schema que você criou no MySQL
        String url = "jdbc:mysql://localhost:3306/java-pratica-conceitos?useTimezone=true&serverTimezone=UTC";

        String usuario = "======"; // usuario
        String senha = "======="; // senha

        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            // Lançamos uma exceção em tempo de execução para não sujar o código com throws
            throw new RuntimeException("Erro ao conectar ao banco de dados: " + e.getMessage(), e);
        }
    }
}