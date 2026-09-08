package Aula06;

public class Ex01 {
    public static void main(String[] args) {

        int n = 3;
        System.out.println(tri(n));


    }

    //recusividade
    public static int tri(int n) {
        if (n == 1) {
            return 1;
        }
        return n + tri(n - 1);
    }
}
