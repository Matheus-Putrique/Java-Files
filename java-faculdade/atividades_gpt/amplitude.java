import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Amplitude");

        System.out.print("Digite um número (0 para parar): ");
        int num = scanner.nextInt();

        int maior = num;
        int menor = num;

        while(num != 0){

            if(num > maior){
                maior = num;
            }

            if(num < menor){
                menor = num;
            }

            System.out.print("Digite outro número (0 para parar): ");
            num = scanner.nextInt();
        }

        int amplitude = maior - menor;

        System.out.println("A amplitude é: " + amplitude);

        scanner.close();
    }
}