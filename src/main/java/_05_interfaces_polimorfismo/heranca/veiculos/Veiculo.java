package _05_interfaces_polimorfismo.heranca.veiculos;

public class Veiculo {

    //ATRIBUTO
    String marca;

    //CONSTRUTOR
    public Veiculo(String marca) {
        this.marca = marca;
    }

    //METODO MOVER
    public void mover(){
        System.out.println("veiculos.heranca.Veiculo em movimento");
    }
}
