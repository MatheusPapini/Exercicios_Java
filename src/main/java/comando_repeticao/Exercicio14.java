package comando_repeticao;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int entre0e100 = 0, entre101e200 = 0, acima200 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            int num = entrada.nextInt();
            if (num >= 0 && num <= 100) {
                entre0e100++;
            } else if (num >= 101 && num <= 200) {
                entre101e200++;
            } else if (num > 200) {
                acima200++;
            }
        }
        System.out.println("Entre 0 e 100: " + entre0e100);
        System.out.println("Entre 101 e 200: " + entre101e200);
        System.out.println("Maiores que 200: " + acima200);
    }
}