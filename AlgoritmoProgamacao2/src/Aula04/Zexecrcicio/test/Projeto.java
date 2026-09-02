package Aula04.Zexecrcicio.test;

import Aula04.Zexecrcicio.dominio.Ordena;
import Aula04.Zexecrcicio.dominio.Pesquisa;
import Aula04.Zexecrcicio.dominio.Print;
import Aula04.Zexecrcicio.dominio.incrementar;
import Aula04.Zexecrcicio.service.Tela;

import java.util.Random;

public class Projeto {
    public static void main(String[] args) {
        int [] vetor = new int[201];

        incrementar.incremetarValor(vetor);
        Ordena.ordenar(vetor);
        Print.mostrarNaTela(vetor);
        Pesquisa.pesquisaBinaria(vetor,Tela.telado());

    }
}
