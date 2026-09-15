package Aula07.QuickSort;

import static Aula07.dominio.incrementador.aleatorio;

import static Aula07.dominio.quickSort.quickSort;

public class QuickSortTest01 {
    public static void main(String[] args) {

        int[] vetor = new int[201];

        aleatorio(vetor);

        quickSort(vetor, 0, vetor.length - 1);

        int contador = 0;

        for (int valor : vetor) {
            if (contador >= 20)return;
            System.out.print(valor + " ");
            contador ++;
        }
    }
}


