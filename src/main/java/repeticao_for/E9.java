package repeticao_for;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = leitor.nextLine();
            System.out.print("Digite a idade: ");
            int idade = leitor.nextInt();
            leitor.nextLine();

            somaIdades += idade;
        }

        System.out.println("Média das idades: " + (double) somaIdades / 5);
    }
}
