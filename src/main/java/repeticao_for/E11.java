package repeticao_for;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();
        int soma = 0;

        for (int i = 2; i <= num; i += 2) {
            soma += i;
        }

        System.out.println("Soma dos pares entre 1 e " + num + ": " + soma);
    }
}
