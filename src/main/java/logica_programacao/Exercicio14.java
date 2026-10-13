package logica_programacao;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Anos: ");
        int anos = entrada.nextInt();

        System.out.print("Meses: ");
        int meses = entrada.nextInt();

        System.out.print("Dias: ");
        int dias = entrada.nextInt();

        int totalDias = anos * 365 + meses * 30 + dias;

        System.out.println("Total de dias vividos: " + totalDias);
    }
}