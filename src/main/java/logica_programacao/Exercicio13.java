package logica_programacao;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        if (num2 != 0 && num1 % num2 == 0)
            System.out.println(num1 + " é múltiplo de " + num2);
        else
            System.out.println(num1 + " NÃO é múltiplo de " + num2);
    }
}