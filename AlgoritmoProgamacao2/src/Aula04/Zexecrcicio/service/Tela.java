package Aula04.Zexecrcicio.service;
import java.util.Scanner;

public class Tela {

    public static int telado() {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o numero que você deseja encontrar: ");
        int valor = leia.nextInt();

        return valor;
    }
}