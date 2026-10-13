package repeticao_do_while;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();
        int i = 2, soma = 0;

        do {
            soma += i;
            i += 2;
        } while (i <= num);

        System.out.println("Soma dos pares: " + soma);
    }
}
