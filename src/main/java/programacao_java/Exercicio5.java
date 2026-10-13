package programacao_java;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Não eleitor (abaixo de 16 anos)");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Eleitor obrigatório (entre 18 e 65 anos)");
        } else {
            System.out.println("Eleitor facultativo (de 16 a 18 anos ou acima de 65 anos)");
        }
    }
}
