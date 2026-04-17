import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int num;
       
        System.out.print("Digite o numero: ");
        num = scanner.nextInt();
       
        if(num % 2 == 0 || num % 7 == 0){
            System.out.print("Numero divisivel por 2 ou 7");
        }
        else{
            System.out.print("Numero nao divisivel por 2 ou 7");
        }
       
       scanner.close();
    }
}