package repeticao_for;

import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = leitor.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + num + ": " + fatorial);
    }
}
