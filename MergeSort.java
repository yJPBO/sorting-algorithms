package sortAlgorithms;

public class MergeSort {
    static void mergeSort(int[] vetor) {
        mergeSort(vetor, new int[vetor.length], 0, vetor.length-1);
    }
    static void mergeSort(int[] vetor, int[] aux, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;

        mergeSort(vetor, aux, low, mid);
        mergeSort(vetor, aux, mid + 1, high);

        merge(vetor, aux, low, mid, high);
    }
    static void merge(int[] vetor, int[] aux, int low, int mid, int high) {
        for (int k = low; k <= high; k++) aux[k] = vetor[k];

        int i = low;     
        int j = mid + 1;

        for(int k = low; k <= high; k++) {
            if (i > mid) vetor[k] = aux[j++];
            else if (j > high) vetor[k] = aux[i++];
            else if (aux[i] < aux[j]) vetor[k] = aux[i++];
            else vetor[k] = aux[j++]; 
        }
    }
}
