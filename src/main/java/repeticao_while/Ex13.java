package repeticao_while;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = leitor.nextInt();

        if (num == 0) {
            System.out.println(0);
        } else {
            // Para garantir que funcione com negativos
            num = Math.abs(num);

            // Inverte o número temporariamente
            int temp = 0;
            while (num > 0) {
                temp = temp * 10 + (num % 10);
                num /= 10;
            }

            while (temp > 0) {
                System.out.println(temp % 10);
                temp /= 10;
            }
        }
    }
}
