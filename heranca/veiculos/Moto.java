public class Moto extends Veiculo{
    int cilindrada;

    public Moto(String marca, int cilindrada) {
        super(marca); //chamando do pai
        this.cilindrada = cilindrada;
    }

    @Override
    public void mover(){
        System.out.println("O veiculo está com tudo!");
    }
}
