package logica_programacao;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = entrada.next().toUpperCase().charAt(0);

        if ((sexo == 'M' && idade >= 65) || (sexo == 'F' && idade >= 60))
            System.out.println("Pode se aposentar.");
        else
            System.out.println("Não pode se aposentar.");
    }
}