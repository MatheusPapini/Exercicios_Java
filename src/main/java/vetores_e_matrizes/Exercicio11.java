package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaPos = 0, somaNeg = 0;

        for (int i = 0; i < 10; i++) {
            int num = entrada.nextInt();
            if (num > 0) somaPos += num;
            else if (num < 0) somaNeg += num;
        }

        System.out.println("Soma dos positivos: " + somaPos);
        System.out.println("Soma dos negativos: " + somaNeg);
    }
}