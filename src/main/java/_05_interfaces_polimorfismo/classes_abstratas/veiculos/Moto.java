package _05_interfaces_polimorfismo.classes_abstratas.veiculos;

public class Moto extends Veiculo {
    public int cilindradas;

    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano); // Chama o construtor da classe pai
        this.cilindradas = cilindradas;
    }
    @Override
    public double velocidadeMaxima() {
        return cilindradas * 0.5; // Calcula a velocidade máxima com base nas cilindradas
    }
}
