package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            nums[i] = entrada.nextInt();
        }

        int maior = nums[0], menor = nums[0];
        for (int n : nums) {
            if (n > maior) maior = n;
            if (n < menor) menor = n;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}