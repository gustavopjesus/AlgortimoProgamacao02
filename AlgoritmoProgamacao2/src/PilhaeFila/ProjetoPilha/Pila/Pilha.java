package PilhaeFila.ProjetoPilha.Pila;

import java.util.Arrays;

public class Pilha {
    private int [] vetor;
    private int controle = 0;

    public Pilha(int tamenho ) {
        vetor = new int[tamenho];
    }

    /**
    * retorna true se está vazio
    * @return boolean
     */
    public boolean emty(){
        return controle == 0;
    }

    public boolean full (){
        return controle == vetor.length;
    }

    /**
     * inserir valor no vetor
     * @param vetor
     */
    public void push(int n){
        if (!full()) {
            vetor[controle] = n;
            controle++;
        }else {
            System.out.println("\n!!!PILHA CHEIA!!!\n");
        }
    }

    public int size(){
        return controle;

    }

    public int pop() {
        int i = vetor[controle - 1];
        controle--;
        return i;
    }

    public int top() {
        if (emty()) {
            System.out.println("Pilha vazia!");
            return -1;
        }

        return vetor[controle - 1];
    }


    public void exibir() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);

            if (i < vetor.length - 1){
                System.out.print(" - ");
            }
        }
    }
}
