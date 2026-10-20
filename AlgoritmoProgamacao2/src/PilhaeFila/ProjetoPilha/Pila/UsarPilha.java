package PilhaeFila.ProjetoPilha.Pila;

import javax.management.RuntimeErrorException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UsarPilha {
    public static void main(String[] args) {
        /*
               Pilha (Stack)

        - push: adiciona um elemento.
        - pop: remove o último elemento adicionado.
        - peek ou top: consulta o elemento do topo sem remover.
        - isEmpty: verifica se está vazia.
         */


        Scanner leia = new Scanner(System.in);

        boolean iniciar = true;
        Pilha pilha = new Pilha(5);

        while (iniciar) {

            System.out.println("\n1 - Adicionar elemento");
            System.out.println("2 - Remover elemento");
            System.out.println("3 - Exibir elemento do topo");
            System.out.println("4 - Verificar se a pilha está vazia");
            System.out.println("5 - Verificar se a pilha está cheia");
            System.out.println("6 - Exibir tamanho da pilha");
            System.out.println("7 - Sair");

            try {
                System.out.print("\n Digite sua opção: ");
                int opcao = leia.nextInt();


                switch (opcao) {
                    case 1:
                        System.out.println("\nADICIONANDO VALOR A PILHA\n");
                        System.out.print("Digite o valor: ");
                        pilha.push(leia.nextInt());
                        System.out.println("\n");
                        pilha.exibir();
                        System.out.println("\n");
                        break;
                    case 2:
                        if (!pilha.emty()){
                        System.out.println("\nREMOVENDO VALOR DA PILHA\n");
                         System.out.println(pilha.pop());;
                         pilha.exibir();
                        }else {
                            System.out.println("PILHA VAZIA");
                        }
                        break;
                    case 3:
                        System.out.println("\nMOSTRAR O ULTIMO\n");
                        int valor = pilha.top();
                        System.out.println("Ultimo valor adicionado " + valor + "\n");
                        pilha.exibir();
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("\nVERIFICAR SE A PILHA ESTÁ VAZIA\n");
                        System.out.println(pilha.emty());
                        pilha.exibir();
                        System.out.println("\n");
                        break;
                    case 5:
                        System.out.println("\nVERIFICAR SE A PILHA ESTÁ CHEIA\n");
                        System.out.println(pilha.full());
                        pilha.exibir();
                        System.out.println("\n");
                        break;
                    case 6:
                        System.out.println("\nVERIFICAR TAMANHO DA PILHA\n");
                        System.out.println("TAMANHO DAA PILHA: "+pilha.size() + "\n");
                        pilha.exibir();
                        System.out.println("\n");
                        break;
                    case 7:
                        for (int i = 0; i < 600; i++) {
                            System.out.println("\nSAINDO...............................");
                        }
                        leia.close();
                        return;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (RuntimeErrorException e) {
                e.printStackTrace();
                System.out.println("\nDigite uma das opções\n");
            }
        }
    }
}

