package repeticao_while;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 1, idade, soma = 0;
        while (i <= 5) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            idade = leitor.nextInt();
            soma += idade;
            i++;
        }
        double media = (double) soma / 5;
        System.out.println("Média das idades: " + media);
    }
}
