import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite um numero: ");
       int numero = scanner.nextInt();
       
       int prox_numero = numero + 1;
       int ant_numero = numero - 1;
       
       System.out.printf("O %d e o sucessor e o %d e o antecessor", prox_numero, ant_numero);
       
       
       scanner.close();
    }
}