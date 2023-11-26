package sortAlgorithms;

public class BubbleSort {
    static void bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            boolean mod = false;
            for (int x = 0; x < vetor.length - i - 1; x++) {
                if (vetor[x + 1] < vetor[x]) {
                    int temp = vetor[x];
                    vetor[x] = vetor[x + 1];
                    vetor[x + 1] = temp;
                    mod = true;
                }
            }
            if (mod == false)
                break;
        }
    }   
}
