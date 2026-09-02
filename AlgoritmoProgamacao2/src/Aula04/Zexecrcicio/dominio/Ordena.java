package Aula04.Zexecrcicio.dominio;

public class Ordena {

    public static void ordenar(int[] v) {

        for (int i = 1; i < v.length; i++) {

            int valor = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > valor) {
                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = valor;
        }
    }
}