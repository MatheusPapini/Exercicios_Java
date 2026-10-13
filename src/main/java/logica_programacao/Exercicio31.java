package logica_programacao;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor do salário-mínimo: ");
        double salarioMinimo = entrada.nextDouble();

        System.out.print("Salário do funcionário: ");
        double salarioFuncionario = entrada.nextDouble();

        double qtdSalarios = salarioFuncionario / salarioMinimo;

        System.out.printf("O funcionário recebe %.2f salários mínimos.\n", qtdSalarios);
    }
}