package vetores_e_matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            nums[i] = entrada.nextInt();
        }

        Arrays.sort(nums);
        System.out.println("Em ordem decrescente:");
        for (int i = 4; i >= 0; i--) System.out.println(nums[i]);
    }
}