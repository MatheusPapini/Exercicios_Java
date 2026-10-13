package repeticao_while;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = leitor.nextInt();
        int i = 2, cont = 0;

        if (num < 2) {
            System.out.println(num + " não é primo.");
        } else {
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    cont++;
                    break;
                }
                i++;
            }
            if (cont == 0) {
                System.out.println(num + " é primo.");
            } else {
                System.out.println(num + " não é primo.");
            }
        }
    }
}
