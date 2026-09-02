package Aula04.dominio;

public class Media {


    public static void mm (int [] v){
        double soma = 0;
        int contandor = 0;
        for (int i = 0; i <v.length; i++) {
           soma = v[i] + v [i+1];
            contandor ++;
        }
        double mediaa = soma/contandor;
        System.out.println("A média é; " + mediaa);
    }
}
