package logica_programacao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = entrada.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = entrada.nextDouble();

        System.out.print("Nota 3: ");
        double n3 = entrada.nextDouble();

        double media = (n1*2 + n2*3 + n3*5) / 10;

        System.out.println("Média ponderada: " + media);
    }
}