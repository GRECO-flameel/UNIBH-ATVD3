import java.util.Scanner;


public class exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vetor[] = new int[12];
        int media = 0, soma = 0, maiores = 0;

        for(int i = 0; i <= 11; i++){
            vetor[i] = scan.nextInt();
            soma += vetor[i]; 

            media = soma / 12;

            }

        media = soma / 12;

        for(int i = 0; i <= 11; i++){
            if(vetor[i] > media){
                maiores++;
        }
            
            
        }

        System.out.printf("a media dos numeros do vetor e: %d\ne %d desses numeros sao maiores que ela", media, maiores);

    }
}
