package _02_encapsulamento_construtores.quadrado_encapsulado.entities;

public class Square {

    // Atributo privado: as características do quadrado estão protegidas (Encapsulamento)
    // Ninguém de fora da classe pode alterar esse valor diretamente
    private double side;

    // Construtor padrão: permite instanciar o objeto sem passar parâmetros iniciais
    public Square() {
    }

    // Novo construtor customizado (sobrecarga)
    // Permite fazer: Square s = new Square(3.5);
    public Square(double side) {
        setSide(side); // chama o setter para já validar o valor no nascimento
    }

    // Setter: Método público que serve como a única porta de entrada para modificar o atributo
    public void setSide(double side) {
        // Regra de Negócio: impede que o sistema aceite dados geometricamente inválidos
        if (side <= 0) {
            throw new IllegalArgumentException("Invalid side value! Must be greater than zero.");
        }
        this.side = side; // "this.side" aponta para o atributo; "side" é o parâmetro recebido
    }

    // Getter: Método público que serve como a porta de saída para ler o atributo privado com segurança
    public double getSide() {
        return this.side;
    }

    // Método: A ação que o quadrado sabe fazer (calcular sua própria área)
    public double area() {
        return this.side * this.side; // Usa o atributo privado protegido
    }
}