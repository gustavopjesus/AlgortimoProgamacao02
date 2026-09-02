package Aula02;

import java.util.Random;

public class ex02 {
    public static void main(String[] args) {

        int[][] matrix = new int[6][6];
        inserirValor(matrix);
        System.out.println("----------------");
        exibir(matrix);

    }
        public static void inserirValor(int[][] m){
            Random rd = new Random();
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j <m[0].length ; j++) {
                    m [i][j] = rd.nextInt(2,101);
                }
            }
        }

        public static void exibir (int [][]m){

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    System.out.println(m[i][j] + " ");
                    System.out.println("----");
                }

            }

        }

    }

