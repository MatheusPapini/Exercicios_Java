package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = sc.nextInt();
            }

        int produto = 1;
        for (int i = 0; i < 3; i++) {
            produto *= mat[i][2 - i];
        }

        System.out.println("Produto da diagonal secundária: " + produto);
        sc.close();
    }
}