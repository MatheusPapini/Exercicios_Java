package repeticao_while;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();
        int i = 2, soma = 0;
        while (i <= num) {
            soma += i;
            i += 2;
        }
        System.out.println("Soma dos pares entre 1 e " + num + ": " + soma);
    }
}
