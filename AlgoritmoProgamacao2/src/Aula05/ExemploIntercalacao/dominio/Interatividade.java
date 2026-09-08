package Aula05.ExemploIntercalacao.dominio;

import java.util.jar.JarEntry;

public class Interatividade {

    public static void interativid(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        // Se ainda houver elementos em A
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        // Se ainda houver elementos em B
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
        // Mostra o vetor C
        for (int valor : c) {
            System.out.print(valor + " ");
        }
    }
}
