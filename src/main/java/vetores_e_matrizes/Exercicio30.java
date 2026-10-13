package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] a = new int[2][2], b = new int[2][2], sub = new int[2][2];

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

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                sub[i][j] = a[i][j] - b[i][j];

        System.out.println("Subtração das matrizes:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sub[i][j] + " ");
            }
        }
    }
}