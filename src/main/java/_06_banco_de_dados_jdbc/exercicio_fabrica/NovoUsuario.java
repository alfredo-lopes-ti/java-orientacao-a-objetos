package _06_banco_de_dados_jdbc.exercicio_fabrica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovoUsuario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do usuario: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o email do usuario: ");
        String email = entrada.nextLine();

        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";

        try (Connection conexao = FabricaConexao.getConexao()) {
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.setString(2, email);

            stmt.execute();
            System.out.println("Usuario " + nome + " inserido com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir: " + e.getMessage());
        }

        entrada.close();
    }
}