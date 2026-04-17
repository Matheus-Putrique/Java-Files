import java.util.*;

public class sobrecarga {
    
    public static void menu(){
        System.out.println("Bem vindo ao calculador de área");
        System.out.println("[1] Quadrado");
        System.out.println("[2] Triângilo");
    }
    
    public static float area(float L1, float L2){
        return L1 * L2;
    }
    public static float area(float L1, float L2, float L3){
        return L1 * L2 * L3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> lado = new ArrayList<>();
        int escolha;
        float valor;
        float resultado;

        menu();
        
        System.out.println("Escolha: ");
        escolha = scanner.nextInt();


        switch(escolha){
            case 1:
                for(int i = 0; i < 2; i++){
                    System.out.println("Digite o valor dos lados: ");
                    valor = scanner.nextFloat();
                    lado.add(valor);
                }
                resultado = area(lado);
        }
        
            
        }
    }

