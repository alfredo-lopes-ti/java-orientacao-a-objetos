package interfaces.funcionarios;

// Gerente assina os dois contratos ao mesmo tempo
// sepatados por vírgula após "implements"
public class Gerente implements Autenticavel, Gerenciavel {

    private String nome;
    private String senha;
    private String cargo;
    private double salario;

    public Gerente(String nome, String senha, String cargo, double salario) {
        this.nome = nome;
        this.senha = senha;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Contrato 1: Autenticavel
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    // Contrato 2: Gerenciavel
    @Override
    public void promover(String novoCargo) {
        System.out.println(nome + " promovido para " + novoCargo);
        this.cargo = novoCargo;
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.20; // 20% de bônus
    }
}
