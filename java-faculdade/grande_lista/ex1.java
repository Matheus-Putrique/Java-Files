import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
         //Primeria parte
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Joao");
        nomes.add("Pedro");
        nomes.add("Maria");
        
        System.out.println(nomes);
        
         //Segunda parte
         
         System.out.println(nomes.get(0));
         System.out.println(nomes.size());
         
          //Terceira parte
          nomes.set(1, "Lucas");
          System.out.println(nomes.get(1));
          
           //Quarta parte
           nomes.remove("Carlos");
           nomes.remove(0);
           System.out.println(nomes);
           
           //Quinta parte
           if(nomes.contains("Pedro")){
               System.out.println("Pedro esta na lista");
           }
           
           nomes.clear();
           if(nomes.isEmpty()){
               System.out.println("Lista vazia");
           }
            nomes.add("Ana");
             nomes.add("Carlos");
            nomes.add("Joao");
            nomes.add("Pedro");
            nomes.add("Maria");
           
           for(int i = 0; i < nomes.size();i++){
               System.out.println(nomes.get(i));
           }
    }