import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int i;
       int num;
       int[] vetor = new int[5];
       boolean encontrado = false;
       
       for(i = 0; i < 5;i++){
           System.out.printf("Digite os numeros[%d]: ", i + 1);
           vetor[i] = scanner.nextInt();
       }
       System.out.println("Digite o numero a ser encontrado: ");
       num = scanner.nextInt();
       
       for(i = 0; i < 5;i++){
           if(num == vetor[i]){
            System.out.printf("Numero encontrado no vetor %d " ,vetor[i] );
            encontrado = true;
            break;
           }
       }
       if(encontrado == false){
           System.out.println("Numero nao encontrado nos vetores");
       }
     
    }
}