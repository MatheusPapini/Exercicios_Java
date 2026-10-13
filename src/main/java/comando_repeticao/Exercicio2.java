package comando_repeticao;

public class Exercicio2 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 15; i++) {
            soma += i;
        }
        System.out.println("Soma dos números de 1 a 15: " + soma);
    }
}