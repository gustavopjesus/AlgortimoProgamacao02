package Aula04.test;

import Aula04.dominio.Exibir;
import Aula04.dominio.Ingrementar;
import Aula04.dominio.Pesquisa;
import java.util.Scanner;

public class EstruturaDados {
    public static void main(String[] args) {
        int [] vetor = new int[100];
       Scanner leia = new Scanner(System.in);
;
        Ingrementar.ingrementarValor(vetor);
        Exibir.exibirTela(vetor);

        System.out.println("Digite o valor: ");
        int valor = leia.nextInt();
        int indice = Pesquisa.pesquisaValor(valor, vetor);
        if(indice >= 0){
            System.out.printf("Achou o valor: " + valor + " No indice: " + indice);
        }else {
            System.out.println("Não foi achado o valor");
        }


    }
}
