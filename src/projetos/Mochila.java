package projetos;

import java.util.*;

public class Mochila {

        public static int knapsackDP(int[] pesos, int[] valores, int capacidade) {
        int n = pesos.length;
        int[] dp = new int[capacidade + 1];

        for (int i = 0; i < n; i++) {
            for (int w = capacidade; w >= pesos[i]; w--) {
                dp[w] = Math.max(dp[w], valores[i] + dp[w - pesos[i]]);
            }
        }
        return dp[capacidade];
    }


    public static int knapsackGreedy(int[] pesos, int[] valores, int capacidade) {
        int n = pesos.length;
        Item[] itens = new Item[n];

        for (int i = 0; i < n; i++) {
            itens[i] = new Item(pesos[i], valores[i]);
        }

        Arrays.sort(itens, (a, b) -> Double.compare(b.valorPorPeso, a.valorPorPeso));

        int pesoAtual = 0;
        int valorTotal = 0;

        for (Item item : itens) {
            if (pesoAtual + item.peso <= capacidade) {
                pesoAtual += item.peso;
                valorTotal += item.valor;
            }
        }

        return valorTotal;
    }

    static class Item {
        int peso;
        int valor;
        double valorPorPeso;

        Item(int peso, int valor) {
            this.peso = peso;
            this.valor = valor;
            this.valorPorPeso = (double) valor / peso;
        }
    }
}