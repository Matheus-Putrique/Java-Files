 import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int i;
        float media = 0;
        int soma= 0;
       
        for(i = 0;i < 5;i++){
            System.out.printf("Digite os valores[%d]: ", i + 1);
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }
       
        media = soma / 5;
        System.out.println("a media e: " + media);
        for(i = 0;i < 5;i++){
            if(vetor[i] >= media){
                System.out.println(vetor[i] + " Este numero e maior que a media");
            }
        }
    }
} {
    
}
