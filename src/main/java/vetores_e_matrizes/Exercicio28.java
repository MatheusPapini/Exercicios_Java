package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] mat = new int[4][4];

        System.out.println("Digite os elementos da matriz 4x4:");

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = entrada.nextInt();
            }

        for (int i = 0; i < 4; i++) {
            int maiorLinha = mat[i][0];
            for (int j = 1; j < 4; j++) {
                if (mat[i][j] > maiorLinha) maiorLinha = mat[i][j];
            }
            System.out.println("Maior da linha " + (i+1) + ": " + maiorLinha);
        }
    }
}