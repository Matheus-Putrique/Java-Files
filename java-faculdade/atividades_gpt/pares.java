import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int digitado;
        int contador = 0;
       
        System.out.println("Digite o numero: ");
        digitado = scanner.nextInt();
       
       
        for(num = 1; num <= digitado; num++){
           if( num % 2 == 0){
               System.out.println(num);
               contador++;
           }
        }
        System.out.print("Os numeros pares sao: " + contador);
        scanner.close();
    }
}