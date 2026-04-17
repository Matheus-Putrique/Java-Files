import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int num1, num2, num3;
       
       System.out.print("Digite o primeiro: ");
       num1 = scanner.nextInt();
       
       System.out.print("Digite o segundo: ");
       num2 = scanner.nextInt();
       
       System.out.print("Digite o terceiro: ");
       num3 = scanner.nextInt();
       
       if(num1 < num2 && num1 < num3){
           System.out.printf("O menor numero e %d", num1);
       }
       else if(num2 < num1 && num2 < num3){
           System.out.printf("O menor numero e %d", num2);
       }
       else{
           System.out.printf("O menor numero e %d", num3);
       }
       
       scanner.close();
    }
}
