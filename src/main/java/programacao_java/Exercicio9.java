package programacao_java;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioMinimo = 1212.00;

        System.out.print("Digite o valor do seu salário: ");
        double salarioUsuario = entrada.nextDouble();

        double quantidadeSalarios = salarioUsuario / salarioMinimo;

        System.out.printf("Você ganha %.2f salários mínimos.\n", quantidadeSalarios);
    }
}
