    package Aula06.exercicios;

    import java.util.Arrays;

    public class Ex02 {
        public static void main(String[] args) {

            String [] nomes = {"ana", "Bruno", "carla", "Diego", "eduarda", "Felipe", "gabriela", "Henrique", "isabela", "João"};

            for (int i = 0; i < nomes.length; i++) {
                int menor = i;
                for (int j = i + 1; j < nomes.length ; j++) {
                    if (nomes[j].compareTo(nomes[menor]) < 0){
                        menor = j;
                    }
                }
                String aux = nomes[i];
                nomes[i] = nomes[menor];
                nomes[menor] = aux;
            }

            System.out.println(Arrays.toString(nomes));


        }
    }
