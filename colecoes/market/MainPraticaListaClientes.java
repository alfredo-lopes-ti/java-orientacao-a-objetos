package colecoes.market;

import java.util.ArrayList;

public class MainPraticaListaClientes {
    public static void  main(String[] args) {

        // Cria um ArrayList de String chamado clientes
        ArrayList<String> clientes = new ArrayList<>();

        // Adiciona quatro nomes à lista
        clientes.add("João Maria");
        clientes.add("Maria do Carmo");
        clientes.add("Pedro Silva");
        clientes.add("Ana Lopes");

        // Percorre a lista com for e imprime cada nome
        System.out.println("---Lista de clientes---");
        for (int i = 0; i < clientes.size(); i++){
            System.out.println("Clientes " + clientes.get(i));
        }

        // Remove um nome pelo índice (remove o primeiro)
        clientes.remove(0);
        System.out.println("\n[Cliente removido com sucesso!]");

        // Imprime o tamanho da lista depois da remoção
        System.out.println("Tamanho da lista: " + clientes.size());
    }
}
