package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] a = new int[2][2], b = new int[2][2], prod = new int[2][2];

        System.out.println("Matriz A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = entrada.nextInt();
            }

        System.out.println("Matriz B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                System.out.print("b[" + i + "][" + j + "] = ");
                b[i][j] = entrada.nextInt();
            }

        prod[0][0] = a[0][0]*b[0][0] + a[0][1]*b[1][0];
        prod[0][1] = a[0][0]*b[0][1] + a[0][1]*b[1][1];
        prod[1][0] = a[1][0]*b[0][0] + a[1][1]*b[1][0];
        prod[1][1] = a[1][0]*b[0][1] + a[1][1]*b[1][1];

        System.out.println("Produto das matrizes:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(prod[i][j] + " ");
            }
        }
    }
}