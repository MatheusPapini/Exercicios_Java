package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] mat = new int[2][2];
        int soma = 0;

        System.out.println("Digite os elementos da matriz 2x2:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = entrada.nextInt();
                soma += mat[i][j];
            }
        }

        System.out.println("Soma dos elementos: " + soma);
    }
}