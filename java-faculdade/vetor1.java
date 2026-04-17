 import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int[] vetor = new int[5];
        int i;
       
        for(i = 0;i < 5;i++){
            System.out.printf("Digite o valor do vetor[%d]: ", i + 1);
            vetor[i] = scanner.nextInt();
        }
        for(i = 4; i >= 0; i--){
            System.out.printf(vetor[i] + "");
        }
       
        scanner.close();
    }
} {
    
}
