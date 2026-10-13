package repeticao_for;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();
        boolean ePrimo = true;

        if (num < 2) {
            ePrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ePrimo = false;
                    break;
                }
            }
        }

        if (ePrimo)
            System.out.println("É primo.");
        else
            System.out.println("Não é primo.");
    }
}
