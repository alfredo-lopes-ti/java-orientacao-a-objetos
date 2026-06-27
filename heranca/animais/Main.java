package heranca.animais;

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Rex", "Labrador");
        Gato cat = new Gato("Mimi");

        System.out.println(dog.nome);
        System.out.println(cat.nome);

        dog.apresentar();
        dog.emitirSom();
        //cat.emitirSom();
    }
}