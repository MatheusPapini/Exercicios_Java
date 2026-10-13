package repeticao_while;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = leitor.nextInt();
        long fatorial = 1;
        int i = 1;
        while (i <= num) {
            fatorial *= i;
            i++;
        }
        System.out.println(num + "! = " + fatorial);
    }
}
