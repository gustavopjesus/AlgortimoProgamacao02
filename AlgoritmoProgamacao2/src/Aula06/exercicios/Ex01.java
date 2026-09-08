package Aula06.exercicios;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        long[] vetor = new long[1000];
        Random rd = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextLong(1, 2500);
        }
            margeSort(0, vetor.length - 1,vetor );


            int contador = 0;

                for (int j = 0; j <vetor.length; j++) {
                    if (contador < 20) {
                        System.out.println(vetor[j]);
                        contador++;
                    }
                }

        System.out.println("-----------");
        System.out.println("Mostrando todo o vetor");
        System.out.println(Arrays.toString(vetor));



    }

    public static void margeSort(int inicio, int fim, long[] v) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            margeSort(inicio, meio, v);
            margeSort(meio + 1, fim, v);

            intercalar(v, inicio, meio, fim);
        }
    }

    public static void intercalar(long[] v, int inicio, int meio, int fim) {

        int i = inicio;
        int j = meio + 1;
        int k = 0;


        long[] aux = new long[fim - inicio + 1];

        while (i <= meio && j <= fim) {

            if (v[i] < v[j]) {
                aux[k] = v[i];
                i++;
            } else {
                aux[k] = v[j];
                j++;
            }
            k++;
        }

        while (i <= meio) {
            aux[k] = v[i];
            i++;
            k++;
        }

        while (j <= fim) {
            aux[k] = v[j];
            j++;
            k++;
        }

        for (i = inicio, k = 0; i <= fim; i++, k++) {
            v[i] = aux[k];
        }
    }
}


