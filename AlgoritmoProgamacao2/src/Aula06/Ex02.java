package Aula06;

public class Ex02 {
    public static void main(String[] args) {

        int[] vetor = {3, 5, 6, 4, 8, 1};

        mergeSort(0, vetor.length - 1, vetor);
    }

    public static void mergeSort(int inicio, int fim, int[] v) {

        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio, v);
            mergeSort(meio + 1, fim, v);
        }
    }
}