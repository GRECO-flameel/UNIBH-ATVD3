import java.util.Scanner;


public class exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vetor[] = new int[8];

        for(int i = 0; i <= 7; i++){
            vetor[i] = scan.nextInt();
        }

        System.out.println("Numeros na ordem inversa:");

        for(int i = vetor.length - 1; i >= 0; i--){
                System.out.println(vetor[i]);
        }

    }
}
