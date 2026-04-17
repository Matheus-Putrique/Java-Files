import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int num;
       
       System.out.print("Digite o numero: ");
       num = scanner.nextInt();
       
       if(num % 2 == 0 && num % 3 == 0){
           System.out.print("Este numero e divisivel por 2 e 3");
       }
       else{
           System.out.print("Este numero nao e divisivel por 2 e 3");
       }
       
       scanner.close();
    }
}