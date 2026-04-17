import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        
        while(nomes.size() < 5){
            System.out.println("Digite os nomes: ");
            nomes.add(scanner.next());
        }
        System.out.println(nomes);
        
         //Segunda parte 
         
        while(numeros.size() < 10){
        System.out.println("Digite os numeros: ");
        numeros.add(scanner.nextInt());
        }
        System.out.println(numeros);
        
        //Terceira parte
        for(int numero : numeros){
            if(numero % 2 == 0){
                System.out.println(numero + " e par");
            }
        }
        for(int numero : numeros){
            if(numero % 2 == 1){
                System.out.println(numero + " e impar");
            }
        }
        //Quarta parte
        int maior = 0;
        int menor = numeros.get(0);;
        
        for(int i = 0; i < numeros.size(); i++){
            if(numeros.get(i) > maior){
                maior = numeros.get(i);
            }
            if(numeros.get(i) < menor){
                menor = numeros.get(i);
            }
        }
        System.out.println(maior +" E o maior numero");
        System.out.println(menor + " E o menor numero");
    }