# Classes Abstratas em Java

## Conceitos praticados
- `abstract class` — classe que não pode ser instanciada
- Métodos abstratos — obrigam a subclasse a implementar
- Diferença entre classe abstrata e interface

## Exemplos
**Veículos**

Exercício de classes abstratas com hierarquia de veículos.

**Ideia central:**
- `Veiculo` é a classe abstrata base
- `velocidadeMaxima()` é abstrato — cada veículo calcula do seu jeito
- `exibirInfo()` é concreto — funciona igual para todos

> 💡 Polimorfismo: o mesmo método `exibirInfo()` chama o `velocidadeMaxima()`
> de cada subclasse automaticamente.*
