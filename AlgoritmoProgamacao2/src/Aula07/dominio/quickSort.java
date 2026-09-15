package Aula07.dominio;

import static Aula07.dominio.Particao.particionar;

public class quickSort {


    public static void quickSort(int[] vetor, int inicio, int fim) {

        if (inicio < fim) {
            int indicePivo = particionar(vetor, inicio, fim);
            quickSort(vetor, inicio, indicePivo - 1);
            quickSort(vetor, indicePivo + 1, fim);
        }
    }

}
