package interfaces.funcionarios;

public class MainFuncionario {

    public static  void main(String[] args) {

        // Criando objetos de diferentes tipos
        Funcionario func = new Funcionario("Carlos", "123", "Analista", 4000);
        Gerente ger = new Gerente("Alfredo", "gerente123", "Gerente Jr", 8000);

        // Testando autenticação - os dois são autenticavel
        System.out.println("=== Autenticação ===");
        System.out.println(func.getNome() + " autenticado: " + (func.autenticar("123") ? "acesso liberado" : "acesso negado"));
        System.out.println(ger.getNome() + " autenticado: " + (ger.autenticar("errada") ? "acesso liberado" : "acesso negado"));

        System.out.println();

        // Testando o que só o gerente pode fazer (promoção)
        System.out.println("=== Ações de Gerencia ===");
        ger.promover("Gerente Sênior");
        System.out.printf("Bônus de Gerente: R$ %.2f%n", ger.calcularBonus());

        System.out.println();

        // A mágica: usando a variável pelo tipo da interface
        // O sistema de RH só enxerga "Autenticável" - não importa quem é
        System.out.println("=== Sistema de RH (só enxerga Autenticavel) ===");
        Autenticavel[] usuarios = { func, ger }; //array de interface!

        for (Autenticavel usuario : usuarios) {
            System.out.println(usuario.getNome() + " autenticado: " + (usuario.autenticar("123") ? "acesso liberado" : "acesso negado"));
        }

    }
}
