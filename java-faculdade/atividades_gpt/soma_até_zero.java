import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int soma = 0;
       
        do{
            System.out.println("Digite os numeros para serem somados: ");
            num = scanner.nextInt();
            soma += num;
        }while(num > 0);
       
        System.out.printf("A soma fica: %d", soma);
       
        scanner.close();
    }
}