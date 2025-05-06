
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vetor[] = new int[20];
        int vetorp[] = new int[20];
        int pares = 0;
        int indicePar = 0;

        for (int i = 0; i < 20; i++) {
            vetor[i] = scan.nextInt();
            if (vetor[i] % 2 == 0) {
                vetorp[indicePar] = vetor[i];
                indicePar++;
                pares++;
            }
        }

        System.out.printf("No seu vetor existem %d números pares.\n", pares);
        System.out.print("Esses números são: ");
        for (int i = 0; i < indicePar; i++) {
            System.out.print(vetorp[i] + " ");

                }

                scan.close();

    }

}