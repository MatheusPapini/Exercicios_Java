package repeticao_do_while;

public class Ex2 {
    public static void main(String[] args) {
        int i = 1, soma = 0;
        do {
            soma += i;
            i++;
        } while (i <= 100);
        System.out.println("Soma: " + soma);
    }
}
