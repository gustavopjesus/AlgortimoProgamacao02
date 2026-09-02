package Aula04.test;

public class BuscaBinario {

    public static void main(String[] args) {

        int[] v = new int[200];

        int resultado = pesquisa(7, v);

        System.out.println("Posição: " + resultado);
    }

    public static int pesquisa(int valor, int[] v) {

        int inicio = 0;
        int fim = v.length - 1;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            if (valor == v[meio]) {
                return meio;
            }
            else if (valor > v[meio]) {
                inicio = meio + 1;
            }
            else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}