package repeticao_do_while;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        int idade, soma = 0, count = 0;

        do {
            System.out.print("Digite o nome (ou 'fim' para sair): ");
            nome = leitor.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade: ");
                idade = leitor.nextInt();
                leitor.nextLine(); // Consome quebra de linha

                soma += idade;
                count++;
            }
        } while (!nome.equalsIgnoreCase("fim"));

        if (count > 0)
            System.out.println("Média das idades: " + (double) soma / count);
        else
            System.out.println("Nenhuma idade foi informada.");
    }
}
