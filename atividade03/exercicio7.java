import java.util.Scanner;
import java.util.Random;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int tamanho = 15;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }

        System.out.println("Vetor original:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n\nEscolha um indice de 0 a " + (tamanho - 1) + " para que ele seja excluido:");
        int escolha = scan.nextInt();

        if (escolha < 0 || escolha >= tamanho) {
            System.out.println("Escolha invalida. O numero deve estar entre 0 e " + (tamanho - 1) + ".");
        } else {
            System.out.println("Vetor apos a exclusao do indice " + escolha + ":");
            for (int i = 0; i < tamanho; i++) {
                if (i != escolha) {
                    System.out.print(vetor[i] + " ");
                }
            }
        }

        scan.close();
    }
}
