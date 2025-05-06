
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int vetor[] = new int[15];  
        int maior = 0;

        for(int i = 0; i <= 14; i++){
         vetor[i]= Scan.nextInt();

         if(vetor[i] >= maior){
            maior = vetor[i];
         }

        }

        System.err.printf("O maior numero do seu vetor e: %d",maior);

    }
}