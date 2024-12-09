package projetos;

public class Busca {

    public static int buscaSequencial(int[] arr, int x) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int buscaBinaria(int[] arr, int x) {
        return buscaBinariaRecursiva(arr, x, 0, arr.length - 1);
    }

    private static int buscaBinariaRecursiva(int[] arr, int x, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2; // Evitar estouro de memória
        if (arr[mid] == x) {
            return mid;
        }
        if (arr[mid] < x) {
            return buscaBinariaRecursiva(arr, x, mid + 1, high);
        }
        return buscaBinariaRecursiva(arr, x, low, mid - 1);
    }
}