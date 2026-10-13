package logica_programacao;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = entrada.nextDouble();

        double novoSalario = salario * 1.15;

        System.out.println("Novo salário com aumento de 15%: R$ " + novoSalario);
    }
}