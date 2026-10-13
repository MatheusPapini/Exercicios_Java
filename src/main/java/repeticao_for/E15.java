package repeticao_for;

import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        int idade, soma = 0, count = 0;

        do {
            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
            nome = leitor.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade: ");
                idade = leitor.nextInt();
                leitor.nextLine();

                soma += idade;
                count++;
            }
        } while (!nome.equalsIgnoreCase("fim"));

        if (count > 0) {
            double media = (double) soma / count;
            System.out.println("Média das idades: " + media);
        } else {
            System.out.println("Nenhuma idade foi registrada.");
        }
    }
}
