package comando_repeticao;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int entre0e100 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            int num = entrada.nextInt();
            if (num >= 0 && num <= 100) {
                entre0e100++;
            }
        }
        System.out.println("Números entre 0 e 100: " + entre0e100);
    }
}