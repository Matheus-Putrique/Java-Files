import java.util.*;

public class medianotas {
    
    public static float media(float[] notas){
        float media = 0;
        float soma = 0;
        
        for(int i = 0; i < 3; i++){
            soma += notas[i];
        }
        media = soma / 3;
        return media;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] notas = new float[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Digite suas notas: ");
            notas[i] = scanner.nextFloat();
        }
        float resultado = media(notas);

        System.out.println("A média de notas fica " + resultado);


    }
}
