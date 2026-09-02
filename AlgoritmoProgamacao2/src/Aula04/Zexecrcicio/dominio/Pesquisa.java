package Aula04.Zexecrcicio.dominio;

public class Pesquisa {

    public static int pesquisaBinaria(int[] v, int valor) {

        int inicio = 0;
        int fim = v.length - 1;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            if (v[meio] == valor) {
                System.out.println("Achou! O número está na posição: " + meio);
                return meio;
            }

            if (v[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("Não achou");
        return -1;
    }
}