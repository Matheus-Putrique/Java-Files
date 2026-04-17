import java.util.*;

public class saudar {
    
    public static void saudar(String nome){
        System.out.println("Olá " + nome);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome: ");
        nome = scanner.next();

        saudar(nome);

        scanner.close();
    }
}
