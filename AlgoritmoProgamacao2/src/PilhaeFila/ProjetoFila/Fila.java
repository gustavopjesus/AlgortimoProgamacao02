package PilhaeFila.ProjetoFila;

public class Fila {

  private int[] vetor;
  private int controle = 0;

  public Fila(int tamanho) {
    vetor = new int[tamanho];
  }

  public boolean full() {
    return controle == vetor.length;
  }

  public boolean emty() {
    return controle == 0;
  }

  public int size() {
    return controle;
  }

  public void enqueue(int valor) {
    if (!full()) {
      vetor[controle] = valor;
      controle++;
    } else {
      System.out.println("\nFila cheia.");
    }
  }

  public void dequeue() {
    if (!emty()) {
      for (int i = 0; i < controle - 1; i++) {
        vetor[i] = vetor[i + 1];
      }

      vetor[controle - 1] = 0;
      controle--;

    } else {
      System.out.println("Fila Vazia.");
    }
  }

  public int front() {
    if (emty()) {
      return -1;
    }

    return vetor[0];
  }

  public void mostrar() {
    System.out.println(" ");

    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i]);

      if (i < vetor.length - 1) {
        System.out.print("-");
      }
    }

    System.out.println(" ");
  }
}