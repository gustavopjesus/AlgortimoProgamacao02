package Aula07.dominio;

public class Particao {
    public static int particionar(int[] vetor, int inicio, int fim) {

        int pivo = vetor[fim];

        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {

            if (vetor[j] <= pivo) {

                i++;

                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1;
    }
}
