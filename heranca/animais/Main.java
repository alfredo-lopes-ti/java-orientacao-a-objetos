public class Main {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro("Rex", "Labrador");
        Gato cat = new Gato("Mimi");

        //dog.nome = "Rex"; // campo herdado de animal
        System.out.println(dog.nome);
        System.out.println(cat.nome);

        dog.apresentar();
        dog.emitirSom(); // o metodo sobescrito
        //cat.emitirSom();
    }
}
