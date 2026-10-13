package repeticao_do_while;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();

        num = Math.abs(num);

        do {
            System.out.println(num % 10);
            num /= 10;
        } while (num > 0);
    }
}
