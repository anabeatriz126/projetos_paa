import projetos.Busca;
import projetos.Mochila;
import projetos.Grafos;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Questão 1
       /*
       Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos do array separados por espaço:");
        String[] elementos = scanner.nextLine().split(" ");
        int[] arr = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            arr[i] = Integer.parseInt(elementos[i]);
        }

        System.out.println("Digite o número a ser buscado:");
        int x = scanner.nextInt();

        int resultadoSequencial = Busca.buscaSequencial(arr, x);
        int resultadoBinario = Busca.buscaBinaria(arr, x);

        System.out.println("Resultado Busca Sequencial: " + resultadoSequencial);
        System.out.println("Resultado Busca Binária: " + resultadoBinario);

        scanner.close();
        */

        //Questão 2

        /*

        int[] pesos = {3, 3, 3, 3};
        int[] valores = {6, 6, 6, 6};
        int capacidade = 9;
        int resultadoDP = Mochila.knapsackDP(pesos, valores, capacidade);
        int resultadoGuloso = Mochila.knapsackGreedy(pesos, valores, capacidade);

        System.out.println("Resultado trabalhos.Mochila - Programação Dinâmica: " + resultadoDP);
        System.out.println("Resultado trabalhos.Mochila - Algoritmo Guloso: " + resultadoGuloso);
        System.out.println();

         */
        //Questão 3

        Map<String, List<String>> grafo = new HashMap<>();
        grafo.put("A", Arrays.asList("B", "C"));
        grafo.put("B", Arrays.asList("D", "E"));
        grafo.put("C", List.of("F"));
        grafo.put("D", Collections.emptyList());
        grafo.put("E", List.of("F"));
        grafo.put("F", Collections.emptyList());

        List<String> resultadoBFS = Grafos.bfs(grafo, "A");
        List<String> resultadoDFS = Grafos.dfs(grafo, "A");

        System.out.println("Resultado BFS: " + resultadoBFS);
        System.out.println("Resultado DFS: " + resultadoDFS);

    }
}