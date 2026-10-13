package repeticao_for;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = leitor.nextInt();
            soma += num;
        }

        System.out.println("Média: " + (double) soma / 5);
    }
}
