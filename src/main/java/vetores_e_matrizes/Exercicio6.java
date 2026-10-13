package vetores_e_matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            nums[i] = entrada.nextInt();
        }

        Arrays.sort(nums);
        System.out.println("Números em ordem crescente:");
        for (int n : nums) System.out.println(n);
    }
}