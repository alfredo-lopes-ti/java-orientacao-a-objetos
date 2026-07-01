package database.exercicio_fabrica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarUsuario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ID do usuario que deseja alterar: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpa o buffer do teclado

        System.out.print("Digite o novo nome: ");
        String novoNome = entrada.nextLine();

        String sql = "UPDATE usuarios SET nome = ? WHERE id = ?";

        try (Connection conexao = FabricaConexao.getConexao()) {
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, novoNome);
            stmt.setInt(2, id);

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Usuario atualizado com sucesso!");
            } else {
                System.out.println("Usuario nao encontrado.");
            }

        } catch (SQLException e) {
            System.err.println("Erro ao atualizar: " + e.getMessage());
        }

        entrada.close();
    }
}