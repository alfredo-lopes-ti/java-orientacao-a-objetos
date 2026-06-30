package heranca.veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 4);
        Moto moto = new Moto("Honda", 600);

        System.out.println(carro.marca);
        System.out.println(moto.marca);

        carro.mover();
        moto.mover();

        Veiculo v = new Carro("Ford", 4);
        v.mover();


    }
}