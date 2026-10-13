package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double somaPares = 0, somaImpares = 0;
        int contPares = 0, contImpares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            int num = entrada.nextInt();

            if (num % 2 == 0) {
                somaPares += num;
                contPares++;
            } else {
                somaImpares += num;
                contImpares++;
            }
        }

        System.out.println("Média dos pares: " + (contPares > 0 ? somaPares / contPares : 0));
        System.out.println("Média dos ímpares: " + (contImpares > 0 ? somaImpares / contImpares : 0));
    }
}