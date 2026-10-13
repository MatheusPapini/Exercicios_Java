package java_basico;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        final double SALARIO_MINIMO = 788.00;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do salário do usuário: ");
        double salarioUsuario = entrada.nextDouble();

        double quantidadeSM = salarioUsuario / SALARIO_MINIMO;
        System.out.printf("O usuário ganha %.2f salários mínimos.\n", quantidadeSM);
    }
}