package programacao_java;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI: ");
        double ipi = entrada.nextDouble();

        System.out.println("Peça 1:");
        System.out.print("Código da peça: ");
        int codigo1 = entrada.nextInt();
        System.out.print("Valor unitário: ");
        double valor1 = entrada.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade1 = entrada.nextInt();

        System.out.println("Peça 2:");
        System.out.print("Código da peça: ");
        int codigo2 = entrada.nextInt();
        System.out.print("Valor unitário: ");
        double valor2 = entrada.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade2 = entrada.nextInt();

        double valorTotal = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);

        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);
    }
}