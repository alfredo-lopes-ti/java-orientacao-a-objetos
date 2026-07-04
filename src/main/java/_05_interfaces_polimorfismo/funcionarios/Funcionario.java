package _05_interfaces_polimorfismo.funcionarios;

// Funcionario assina apenas um contrato: Autenticavel
public class Funcionario implements Autenticavel{

    private String nome;
    private String senha;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String senha, String cargo, double salario) {
        this.nome = nome;
        this.senha = senha;
        this.cargo = cargo;
        this.salario = salario;
    }
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
