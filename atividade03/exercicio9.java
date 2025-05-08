import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[6];
        int[] vetor2 = new int[6];

        System.out.println("Preencha o vetor 1:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Preencha o vetor 2:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        System.out.println("Elementos comuns:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (vetor1[i] == vetor2[j]) {
                    System.out.println(vetor1[i]);
                    break;
                }
            }
        }

        scanner.close();
    }
}
