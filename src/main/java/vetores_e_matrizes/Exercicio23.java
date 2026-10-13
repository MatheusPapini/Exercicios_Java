package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = entrada.nextInt();
                if (mat[i][j] < menor) menor = mat[i][j];
            }
        }
        System.out.println("Menor valor: " + menor);
    }
}