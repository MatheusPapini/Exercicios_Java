package repeticao_for;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int num = leitor.nextInt();

        System.out.println("Divisores de " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.println(i);
        }
    }
}
