package sortAlgorithms;

public class QuickSort {

    static void quickSort(int[] vetor) {
        quickSort(vetor, 0, vetor.length-1);
    }
    static void quickSort(int[] v, int esq, int dir) {
        if (esq < dir) {
            int j = separar(v, esq, dir);
            quickSort(v, esq, j-1);
            quickSort(v, j+1, dir);
        }
        
    }
    static int separar(int[] v, int esq, int dir) {
        int i = esq + 1;
        int j = dir;
        int pivo = v[esq];
        while (i <= j) {
            if (v[i] <= pivo) i++;
            else if (v[j] > pivo) j--;
            else if (i <= j) {
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                i++;
                j--;
            }
        }
        int aux = v[esq];
        v[esq] = v[j];
        v[j] = aux;
        return j;
    }
}
