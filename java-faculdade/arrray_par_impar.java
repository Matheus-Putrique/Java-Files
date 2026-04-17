import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
       
       
        while(numeros.size() < 5){
            System.out.println("Informe os valores");
            numeros.add(scanner.nextInt());
            }
        for(int numero : numeros){
            if(numero % 2 == 0){
                System.out.println(numero + " e par");
            }
            if(numero % 2 == 1){
                System.out.println(numero + " e impar");
            }
        }
       
       
   
       
     scanner.close();  
    }
}