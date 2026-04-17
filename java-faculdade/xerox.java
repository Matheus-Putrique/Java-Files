import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_folhas;
        float valor_total;
        float valor_total_cem;
        
        System.out.print("Digite o numero de copias que deseja: ");
        num_folhas = scanner.nextInt();
        
        if(num_folhas <= 100){
            valor_total = num_folhas * 0.25f;
        }
        else{
            valor_total = num_folhas * 0.25f;
            valor_total_cem = (num_folhas - 100 ) * 0.20f;
            valor_total = valor_total + valor_total_cem;
        }
        
            System.out.print(num_folhas + " esse numero de folhas deu no valor de R$" + valor_total);
        
        
        
        scanner.close();
    }
}