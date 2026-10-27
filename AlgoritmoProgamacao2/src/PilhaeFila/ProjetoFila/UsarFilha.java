package PilhaeFila.ProjetoFila;

import java.util.Scanner;

public class UsarFilha {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Fila fila = new Fila(5);

        boolean controle = true;

        while (controle) {

            System.out.println("\n===== MENU FILA =====");
            System.out.println("1 - Enqueue");
            System.out.println("2 - Dequeue");
            System.out.println("3 - Front");
            System.out.println("4 - Mostrar");
            System.out.println("5 - Size");
            System.out.println("6 - Empty");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opção: ");

            int opcao = leia.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nAdicionando valor\n");
                    System.out.print("Digite o valor: ");
                    fila.enqueue(leia.nextInt());
                    fila.mostrar();
                    break;

                case 2:
                    System.out.println("\nRetirando valor\n");
                    fila.dequeue();
                    fila.mostrar();
                    break;

                case 3:
                    System.out.println("\nPrimeiro elemento: " + fila.front());
                    fila.mostrar();
                    break;

                case 4:
                    fila.mostrar();
                    break;

                case 5:
                    System.out.println("\nTamanho: " + fila.size());
                    fila.mostrar();
                    break;

                case 6:
                    System.out.println("\nFila vazia? " + fila.emty());
                    fila.mostrar();
                    break;

                case 0:
                    System.out.println("Saindo!!");
                    controle = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        leia.close();
    }
}