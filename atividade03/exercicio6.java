import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        int escolha = 0;
        char c = 'x';

        for(int i = 0;i < vetor.length;i++){
            System.out.println(vetor[i] + " ");

        }

        System.out.println("\n\nEscolha um número de 0 a 9 para que ele seja excluido:");

        escolha = scan.nextInt();

        for(int i = 0; i < vetor.length; i++){
            if(i != escolha){
                System.out.println(vetor[i] + " ");
            }


        }

        scan.close();


    }
}
