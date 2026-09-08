package Aula05.ExemploFatoial.dominio;

public class Fatoriaal {

    public static double fat(double n) {
        if (n <= 1) {
            return 1;
        }
        return n * fat(n - 1);
    }
}