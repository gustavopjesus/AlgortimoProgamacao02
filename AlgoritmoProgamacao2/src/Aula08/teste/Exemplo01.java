package Aula08.teste;

public class Exemplo01 {
    public static void main(String[] args) {

        Funcionariio funcionariio01 = new Funcionariio("Gustavo", "Gerente", SEMANA.SEX, 2500);

        System.out.println(funcionariio01.comissaoSalrio());

        System.out.println("---------");

    }
}
