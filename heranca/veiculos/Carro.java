public class Carro extends Veiculo {
    int numPortas;

    public Carro(String marca, int numPortas) {
        super(marca);
        this.numPortas = numPortas;
    }

    @Override
    public void mover() {
        System.out.println("Movendo o Carro");
    }
}
