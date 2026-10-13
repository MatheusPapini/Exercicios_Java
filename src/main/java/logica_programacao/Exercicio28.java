package logica_programacao;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = entrada.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f - Classificação: ", imc);

        if (imc < 18.5)
            System.out.println("Abaixo do peso");
        else if (imc < 24.9)
            System.out.println("Peso normal");
        else if (imc < 29.9)
            System.out.println("Sobrepeso");
        else if (imc < 34.9)
            System.out.println("Obesidade grau I");
        else if (imc < 39.9)
            System.out.println("Obesidade grau II");
        else
            System.out.println("Obesidade grau III");
    }
}