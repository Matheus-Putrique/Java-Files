import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sum of two numbers!");
        
        int num1, num2;
        
        System.out.print("First Number: ");
        num1 = scanner.nextInt();
        
        System.out.print("Second number: ");
        num2 = scanner.nextInt();
        
        int soma = num1 + num2;
        
        System.out.printf("%d + %d = %d", num1, num2, soma);

       scanner.close(); 
    }
}