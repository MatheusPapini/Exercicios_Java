package repeticao_do_while;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int num = leitor.nextInt();
        int i = 1;

        System.out.println("Divisores de " + num + ":");
        do {
            if (num % i == 0)
                System.out.println(i);
            i++;
        } while (i <= num);
    }
}
