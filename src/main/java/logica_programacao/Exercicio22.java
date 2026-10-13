package logica_programacao;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = entrada.nextDouble();

        double bonus;

        if (salario > 2000)
            bonus = salario * 0.10;
        else
            bonus = salario * 0.05;

        System.out.println("Valor do bônus: R$ " + bonus);
    }
}