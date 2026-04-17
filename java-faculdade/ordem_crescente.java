import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int num1, num2;
       
        System.out.print("Digite o seu primeiro numero: ");
        num1 = scanner.nextInt();
       
        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextInt();
       
        if(num1 > num2){
            System.out.printf("%d, %d", num1, num2);
        }
        else{
            System.out.printf("%d, %d", num2, num1);
        }
        scanner.close();
    }
}