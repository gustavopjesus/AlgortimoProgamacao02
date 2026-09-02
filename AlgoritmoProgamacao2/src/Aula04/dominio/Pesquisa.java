package Aula04.dominio;

public class Pesquisa {
    private int n1;
    private int[] v;

    public static int pesquisaValor(int valor, int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (valor == v[i]) {
                return i;
            }
        }
        return -1;
    }
}
