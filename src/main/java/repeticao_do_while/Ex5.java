package repeticao_do_while;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número para a tabuada: ");
        int num = leitor.nextInt();
        int i = 1;

        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }
}
