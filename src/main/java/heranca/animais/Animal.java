package heranca.animais;

public class Animal {
    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Emitindo Som");
    }
}