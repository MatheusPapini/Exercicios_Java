package programacao_java;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        int A = entrada.nextInt();
        System.out.print("Digite o valor B: ");
        int B = entrada.nextInt();
        System.out.print("Digite o valor C: ");
        int C = entrada.nextInt();

        int maior, medio, menor;
        if (A >= B && A >= C) {
            maior = A;
            if (B >= C) {
                medio = B;
                menor = C;
            } else {
                medio = C;
                menor = B;
            }
        } else if (B >= A && B >= C) {
            maior = B;
            if (A >= C) {
                medio = A;
                menor = C;
            } else {
                medio = C;
                menor = A;
            }
        } else {
            maior = C;
            if (A >= B) {
                medio = A;
                menor = B;
            } else {
                medio = B;
                menor = A;
            }
        }
        System.out.println("Valores em ordem descendente: " + maior + ", " + medio + ", " + menor);
    }
}
