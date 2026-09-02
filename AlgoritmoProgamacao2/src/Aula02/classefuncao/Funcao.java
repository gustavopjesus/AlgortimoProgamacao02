package Aula02.classefuncao;

public class Funcao {
    private int[][] n1;

    public static int somaTudo(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                 soma += m[i][j];
            }
        }
        return soma;
    }


    public int[][] getN1() {
        return n1;
    }

    public void setN1(int[][] n1) {
        this.n1 = n1;
    }
}
