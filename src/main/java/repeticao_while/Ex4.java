package repeticao_while;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 1, numero, soma = 0;
        while (i <= 5) {
            System.out.print("Digite o " + i + "º número: ");
            numero = leitor.nextInt();
            soma += numero;
            i++;
        }
        double media = (double) soma / 5;
        System.out.println("Média: " + media);
    }
}