package repeticao_do_while;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 1, numero, soma = 0;
        double media;

        do {
            System.out.print("Digite o número " + i + ": ");
            numero = leitor.nextInt();
            soma += numero;
            i++;
        } while (i <= 5);

        media = (double) soma / 5;
        System.out.println("Média: " + media);
    }
}
