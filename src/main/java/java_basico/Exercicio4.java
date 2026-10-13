package java_basico;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        double ipi;
        int code1;
        double valor1;
        int quant1;
        int code2;
        double valor2;
        int quant2;
        double total;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI (%): ");
        ipi = entrada.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        code1 = entrada.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        valor1 = entrada.nextDouble();

        System.out.print("Digite a quantidade da peça 1: ");
        quant1 = entrada.nextInt();

        System.out.print("Digite o código da peça 2: ");
        code2 = entrada.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        valor2 = entrada.nextDouble();

        System.out.print("Digite a quantidade da peça 2: ");
        quant2 = entrada.nextInt();

        total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);
        System.out.printf("Valor total a ser pago: R$ " + total);
    }
}
