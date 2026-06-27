package classes_abstratas.veiculos;

public class Carro extends Veiculo{
    // Atributo próprio da classe Carro
    public int potencia;

    public Carro(String marca, int ano, int potencia){
        super(marca, ano); // Chama o construtor da classe pai
        this.potencia = potencia;
    }

    @Override
    public double velocidadeMaxima() {
        return potencia * 0.8; // Calcula a velocidade máxima com base na potência
    }
}
