package projetos;

import java.util.*;

public class Grafos {

    public static List<String> bfs(Map<String, List<String>> grafo, String inicio) {
        List<String> ordemVisita = new ArrayList<>();
        Set<String> visitados = new HashSet<>();
        Queue<String> fila = new LinkedList<>();

        fila.add(inicio);
        visitados.add(inicio);

        while (!fila.isEmpty()) {
            String vertice = fila.poll();
            ordemVisita.add(vertice);

            List<String> vizinhos = grafo.getOrDefault(vertice, Collections.emptyList());
            Collections.reverse(vizinhos);

            for (String vizinho : vizinhos) {
                if (!visitados.contains(vizinho)) {
                    visitados.add(vizinho);
                    fila.add(vizinho);
                }
            }
        }

        return ordemVisita;
    }

    public static List<String> dfs(Map<String, List<String>> grafo, String inicio) {
        List<String> ordemVisita = new ArrayList<>();
        Set<String> visitados = new HashSet<>();
        Deque<String> pilha = new ArrayDeque<>();

        pilha.push(inicio);

        while (!pilha.isEmpty()) {
            String vertice = pilha.pop();

            if (!visitados.contains(vertice)) {
                visitados.add(vertice);
                ordemVisita.add(vertice);

                List<String> vizinhos = grafo.getOrDefault(vertice, Collections.emptyList());
                for (String vizinho : vizinhos) {
                    if (!visitados.contains(vizinho)) {
                        pilha.push(vizinho);
                    }
                }
            }
        }

        return ordemVisita;
    }
}