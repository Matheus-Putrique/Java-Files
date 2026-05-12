import java.util.*;

public class par_impar {
    
    public static boolean par_impar(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de Par");

        System.out.println("Digite o numero: ");
        int num = scanner.nextInt();

        System.out.println(par_impar(num));
    }
}
