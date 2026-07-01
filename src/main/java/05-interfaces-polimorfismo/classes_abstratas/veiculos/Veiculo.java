package classes_abstratas.veiculos; // Classe abstrata veiculos.heranca.Veiculo apenas para ser herdada

public abstract class Veiculo {
    public String marca;
    public int ano;

    // o construtor guarda esses valores
    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }
    // Não tem corpo, toda classe que herdar veiculo é obrigada a herdar esse metodo
    // Cada uma do seu jeito.
    public abstract double velocidadeMaxima();

    // Metodo que vai chamar velocidade máxima
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima() + " km/h");
    }
}
