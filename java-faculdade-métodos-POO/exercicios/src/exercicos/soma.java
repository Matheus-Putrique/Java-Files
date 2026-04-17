import java.util.*;

public class soma {
    
    public static int somar(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextInt();

        System.out.println(somar(num1, num2));

        scanner.close();
    }
}
