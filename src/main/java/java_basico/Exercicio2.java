package java_basico;

public class Exercicio2 {
    public static void main(String[] args) {

        double media1 = (8 + 9 + 7) / 3.0;
        double media2 = (4 + 5 + 6) / 3.0;
        double somaMedias = media1 + media2;
        double mediaDasMedias = (media1 + media2) / 2.0;

        System.out.printf("Média 1: " + media1 + "\n");
        System.out.printf("Média 2: " + media2 + "\n");
        System.out.printf("Soma das médias: " + somaMedias + "\n");
        System.out.printf("Média das médias: " + mediaDasMedias);
    }
}