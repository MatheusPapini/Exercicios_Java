package repeticao_do_while;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();
        int i = 2, cont = 0;

        if (num < 2) {
            System.out.println("Não é primo.");
            return;
        }

        do {
            if (num % i == 0) cont++;
            i++;
        } while (i <= Math.sqrt(num));

        if (cont == 0)
            System.out.println("É primo.");
        else
            System.out.println("Não é primo.");
    }
}
