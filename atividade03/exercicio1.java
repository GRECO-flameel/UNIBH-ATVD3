
public class exercicio1 {
    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        int soma = 0;
        
        for(int i = 0; i <= 9; i++){
            soma += vetor[i];
        }

        System.out.printf("%d",soma);

    }

    
}