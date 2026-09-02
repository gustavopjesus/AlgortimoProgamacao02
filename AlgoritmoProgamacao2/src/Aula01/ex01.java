package Aula01;

import Aula02.classefuncao.Funcao;

import java.util.Random;

public class ex01 {
    public static void main(String[] args) {

        int[] vetor = new int[150];


        aleatorio(vetor);
        mostrar(vetor);
        ordenar(vetor);
        System.out.println("Ordenado");
        mostrar(vetor);
        soma(vetor);

    }

    public static void aleatorio(int[] v) {
        Random a = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = a.nextInt(551);
        }
    }

    public static void mostrar(int[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println((i) + " Posição: " + a[i]);
            contador++;
        }
        System.out.println("Contador: " + contador);
    }

    public static void ordenar(int[] b) {
        int temp;
        for (int j = 0; j < b.length - 1; j++) {
            for (int i = 0; i < b.length - 1; i++) {
                if (b[i] > b[i + 1]) {
                    temp = b[i];
                    b[i] = b[i + 1];
                    b[i + 1] = temp;
                }
            }
        }
    }

    public static void soma(int[] f) {
        int s = 0;
        for (int i = 0; i < f.length - 1; i++) {
            s = s + f[i];
        }
        System.out.println("Soma:  " + s);

    }
}
