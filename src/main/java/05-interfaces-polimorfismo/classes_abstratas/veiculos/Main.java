package classes_abstratas.veiculos;

// Classe principal, apenas para testar tudo junto
public class Main {
    public  static void main(String[] args) {
        Carro c = new Carro("Toyota", 2022, 200);
        Moto m = new Moto("Honda", 2021, 125);

        // Polimorfismo em ação por meio de exibirInfo(), que faz com que cada um execute velocidadeMaxima()
        // do seu jeito
        c.exibirInfo();
        System.out.println("---");
        m.exibirInfo();

    }
}
