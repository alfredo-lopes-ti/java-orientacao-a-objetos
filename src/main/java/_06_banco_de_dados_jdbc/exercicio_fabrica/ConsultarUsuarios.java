package _06_banco_de_dados_jdbc.exercicio_fabrica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultarUsuarios {

    public static void main(String[] args) {
        String sql = "SELECT id, nome, email FROM usuarios";

        try (Connection conexao = FabricaConexao.getConexao()) {
            Statement stmt = conexao.createStatement();

            // O ResultSet armazena as linhas que o MySQL devolveu
            ResultSet resultado = stmt.executeQuery(sql);

            System.out.println("--- LISTA DE USUÁRIOS ---");

            // O .next() avança linha por linha do banco. Quando não houver mais linhas, ele dá 'false' e para o loop
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String email = resultado.getString("email");

                System.out.println("ID: " + id + " | Nome: " + nome + " | E-mail: " + email);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao consultar dados: " + e.getMessage());
        }
    }
}