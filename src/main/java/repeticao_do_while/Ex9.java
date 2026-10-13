package repeticao_do_while;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 1;
        int idade, soma = 0;
        String nome;

        do {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            nome = leitor.nextLine();
            System.out.print("Digite a idade: ");
            idade = leitor.nextInt();
            leitor.nextLine();

            soma += idade;
            i++;
        } while (i <= 5);

        System.out.println("Média das idades: " + (double)soma / 5);
    }
}
