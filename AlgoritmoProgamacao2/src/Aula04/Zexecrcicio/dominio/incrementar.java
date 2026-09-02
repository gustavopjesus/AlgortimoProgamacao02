package Aula04.Zexecrcicio.dominio;

import java.util.Random;

public class incrementar {
    public static void incremetarValor(int [] v){
        for (int i = 0; i < v.length ; i++) {
            Random random = new Random();
            v [i] = random.nextInt(10, 500);
        }
    }
}
