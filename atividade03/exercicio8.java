import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor1[] = new int[5];
        int vetor2[] = new int[5];

        System.out.println("Digite 5 números inteiros para o primeiro vetor:");
        

        for (int i = 0; i <= 4;i++){
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite 5 números inteiros para o segundo vetor:");

                for (int i = 0; i <= 4;i++){
            vetor2[i] = scanner.nextInt();
                }

                System.out.println("A juncao dos dois vetores e: ");
                for (int i = 0; i <= 4;i++){
                    System.out.print(vetor1[i] + " ");
                }
                for (int i = 0; i <= 4;i++){
                    System.out.print(vetor2[i] + " ");
                }
                

                
    }
}
