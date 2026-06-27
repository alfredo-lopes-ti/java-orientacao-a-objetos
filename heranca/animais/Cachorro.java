package heranca.animais;

public class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitido Som: Au Au");
    }

    public void apresentar() {
        System.out.println("Eu sou " + nome + ", raça: " + raca);
    }
}