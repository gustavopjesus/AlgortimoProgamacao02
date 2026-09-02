package Aula02;

import Aula02.classefuncao.Funcao;

import java.util.Random;

public class ex01 {
    public static void main(String[] args) {
        Funcao funcao = new Funcao();
        int[][] matrix = new int[3][2];

        entrada(matrix);
        exibir(matrix);
        System.out.println("==========");
        System.out.println(funcao.somaTudo(matrix));


//        System.out.println(matrix[0][0]);
//        System.out.println(matrix[0][1]);
//
//        System.out.println(matrix[1][0]);
//        System.out.println(matrix[1][1]);
//
//        System.out.println(matrix[2][0]);
//        System.out.println(matrix[2][1]);

    }

    public static void entrada(int[][] m) {
        Random numeroAleatorio = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = numeroAleatorio.nextInt(10, 91);
            }
        }
    }

    public static void exibir(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println(m [i] [j] + " ");
            }
            System.out.println(" ");
        }
    }
}
