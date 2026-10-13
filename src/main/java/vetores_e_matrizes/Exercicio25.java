package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] mat = new int[4][4];

        System.out.println("Digite os elementos da matriz 4x4:");

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = entrada.nextInt();
            }

        for (int j = 0; j < 4; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 4; i++) {
                somaColuna += mat[i][j];
            }
            System.out.println("Soma da coluna " + (j+1) + ": " + somaColuna);
        }
    }
}