package _05_interfaces_polimorfismo.heranca.animais;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitido Som: Miau Miau");
    }
}