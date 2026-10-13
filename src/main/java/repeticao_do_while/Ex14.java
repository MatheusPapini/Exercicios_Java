package repeticao_do_while;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();
        long fatorial = 1;

        int i = 1;
        do {
            fatorial *= i;
            i++;
        } while (i <= num);

        System.out.println("Fatorial: " + fatorial);
    }
}
