package Aula04.dominio;

import java.util.Random;

public class Ingrementar {
    private int n1;
    private int[] v;

    public static void ingrementarValor(int[] v) {
        Random ranndom = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = ranndom.nextInt(10, 501);
        }
    }


}
