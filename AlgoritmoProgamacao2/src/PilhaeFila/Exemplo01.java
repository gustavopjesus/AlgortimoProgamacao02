package PilhaeFila;

import java.util.Random;

public class Exemplo01 {
    public static void main(String[] args) {

        int [] v = new int[10];

        for (int i = 0; i <v.length ; i++) {
            Random rd = new Random();
            v[i] = rd.nextInt();
        }

        Funcionariio funcionariio01 = new Funcionariio("Gustavo", "Gerente", SEMANA.SEX, 2500);

        System.out.println(funcionariio01.comissaoSalrio());

        System.out.println("---------");

    }
}
