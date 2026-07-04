package _03_memoria_arrays_listas.colecoes.market;

import java.util.HashMap;

public class MainPraticaMapaIdades {
    public static void main(String[] args) {

        // 1. Cria um HashMap<String, Integer> chamado idades
        HashMap<String, Integer> idades = new HashMap<>();

        // 2. Adiciona 3 pares nome -> idade
        // Usamos o metodo .put(chave, valor) para adicionar no HashMap
        idades.put("Alice", 25);
        idades.put("Bruno", 32);
        idades.put("Carla", 19);

        // 3. Busca e imprime a idade de um nome específico com idades.get("nome")
        String nomeParaBuscar = "Bruno";
        Integer idadeEncontrada = idades.get(nomeParaBuscar);
        System.out.println("A idade de " + nomeParaBuscar + " é: " + idadeEncontrada);

        // 4. Verifica se um nome existe com idades.containsKey("nome") e imprime o resultado
        String nomeParaVerificar = "Carla";
        boolean existe = idades.containsKey(nomeParaVerificar);
        System.out.println("O nome '" + nomeParaVerificar + "' está no mapa? " + existe);

        // Testando com um nome que NÃO existe no mapa para ver a diferença
        System.out.println("O nome 'Diego' está no mapa? " + idades.containsKey("Diego"));
    }
}