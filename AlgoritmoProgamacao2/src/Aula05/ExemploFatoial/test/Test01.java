package Aula05.ExemploFatoial.test;

import Aula05.ExemploFatoial.dominio.Fatoriaal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        boolean verificar = true;

        while (true) {
            while (verificar) {
                try {
                    System.out.print("Digite o número:");
                    int n1 = leia.nextInt();
                    if (n1 < 0) {
                        verificar = false;
                    }
                    System.out.println("\nResultado:" + Fatoriaal.fat(n1) + "\n");
                } catch (InputMismatchException e) {
                    System.out.println("\nDigite apenas números inteiros\n");
                   leia.nextLine();
                }
            }
            leia.close();
        }
    }
}
