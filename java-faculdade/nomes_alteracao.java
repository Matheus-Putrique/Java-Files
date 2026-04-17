import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
       
        nomes.add("Carlos");
        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Fernando");
        nomes.add("Diego");
       
        System.out.println(nomes);
       
        //adiciona Helena e gustavo no inicio
        nomes.add("Helena");
        nomes.add(0,"Gustavo");
       
        System.out.println(nomes);
       
        //verifica se o nome Fernando existe
        if(nomes.contains("Fernando")){
            System.out.println("Encontrado na lista");
        }
        //ordem crescente
        Collections.sort(nomes);
        System.out.println(nomes);
       
        //limpar a lista
        nomes.clear();
        System.out.println(nomes);
    }
}
