package repeticao_do_while;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número limite: ");
        int limite = leitor.nextInt();

        int a = 0, b = 1;

        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        } while (a <= limite);
    }
}
