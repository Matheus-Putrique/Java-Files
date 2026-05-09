import java.util.*;


public class EProduto {
    public static void main(String[] args) throws Exception {
        ArrayList<Produto> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int quantidade;
        int escolha;
        String procura;
        
        System.out.println("Quantos produtos serão listados: ");
        quantidade = scanner.nextInt();

        for(int i = 0; i < quantidade; i++){
            System.out.println("Nome do produto: ");
            String nome = scanner.next();

            System.out.println("Valor do produto: ");
            float valor = scanner.nextFloat();

            scanner.nextLine();

            lista.add(new Produto(nome, valor));
        }

        for(int i = 0;i < lista.size(); i++){
            System.out.println("Produto: " + lista.get(i).getNome());
            System.out.println("Valor: " + lista.get(i).getValor());
            System.out.println("-----------");
        }

        System.out.println("Ordem de valor: ");

        lista.sort(Comparator.comparing(Produto:: getValor));
        Collections.reverse(lista);

        for(int i = 0; i < lista.size(); i++){
            System.out.println("Produto: " + lista.get(i).getNome());
            System.out.println("Valor: " + lista.get(i).getValor());
            System.out.println("-----------");
        }
        
        System.out.println("Ordem alfabetica:");
        lista.sort(Comparator.comparing(Produto::getNome));

        for(int i = 0; i < lista.size();i++){
            System.out.println("Produto: " + lista.get(i).getNome());
            System.out.println("Valor: " + lista.get(i).getValor());
            System.out.println("-----------");
        }

        System.out.println("Produtos com valores maior que 100");

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getValor() > 100){
                System.out.println("Produto: " + lista.get(i).getNome());
                System.out.println("Valor: " + lista.get(i).getValor());
                System.out.println("-----------");
            }
        }

        System.out.println("Deseja procurar algum item na lista: [1] SIM  [2] NÃO");
        escolha = scanner.nextInt();

        switch(escolha){
            case 1: 
                System.out.println("Digite o produto que procura:");
                procura = scanner.next();
                if(lista){
                    System.out.println("Este item existe na lista de produtos!");
                }
                else{
                    System.out.println("Este produto não está na lista");
                }
                break;
            case 2 : 
                break;
            default: 
                System.out.println("Algum erro inesperado aconteceu");
        }
        
    }
}
