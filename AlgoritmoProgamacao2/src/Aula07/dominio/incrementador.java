package Aula07.dominio;

import java.util.Random;

public class incrementador {

    public static void aleatorio(int [] v){
        Random rd = new Random();

        for (int i = 0; i < v.length; i++) {
            v[i] = rd.nextInt(10,251);
        }
    }
}
