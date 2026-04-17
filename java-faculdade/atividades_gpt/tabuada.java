import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int num;
        int multi;
        int resultado;
       
        System.out.println("Digite o numero a ser multiplicado");
        multi = scanner.nextInt();
       
        for(num = 1;num <= 10;num++){
            resultado = multi * num;
            System.out.println(multi + "x" + num + "=" + resultado);
        }
       
       
        scanner.close();
    }
}