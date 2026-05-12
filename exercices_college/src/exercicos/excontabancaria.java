import java.util.*;

public class excontabancaria {

    public static void menu(){
    System.out.println("Escolha uma das opções: ");
    System.out.println("[1] Sacar");
    System.out.println("[2] Depositar");
    System.out.println("[3] Sair");
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        contabancaria conta = new contabancaria();
        int escolha;
        double valor = 0;
        
        System.out.println("Nome do usuário");
        conta.titular = scanner.next();
        
        System.out.println("Bem-vindo a sua conta!");
         
        while(true){
            menu();
            System.out.println("Opção: ");
            escolha = scanner.nextInt();

            if(escolha == 1){
                System.out.println("Digite o valor a sacar: ");
                valor = scanner.nextDouble();
                conta.sacar(valor);
            }
            else if(escolha == 2){
                System.out.println("Digite o valor para depositar: ");
                valor = scanner.nextDouble();
                conta.depositar(valor);
            }
            else if(escolha == 3){
                System.out.println("Saiu!");
                break;
            }
            else{
                System.out.println("Erro inesperado tente em outro momento!");
                break;
            }

        }

        conta.MostrarSaldo();
    }
}
