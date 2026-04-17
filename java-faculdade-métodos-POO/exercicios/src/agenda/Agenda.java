import java.util.*;

class Agenda{
    
    public static void menuAgenda(){
        System.out.println("[1] Adicionar contato");
        System.out.println("[2] Editar contato");
        System.out.println("[3] Excluir contato");
        System.out.println("[4] Listar contatos");
        System.out.println("[5] Sair");
        System.out.println("Escolha uma opcao: ");
    }
    public static void menuContato(){
        System.out.println("[1] Editar telefone");
        System.out.println("[2] Editar email");
        System.out.println("[3] Voltar");
        System.out.println("Escolha uma opcao: ");
    }
    public static void adicionarContato(Scanner scanner, ArrayList<Contato> lista){
        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        lista.add(new Contato(nome, telefone, email));

        System.out.println("Contato adicionado");
    }
    public static void listarContato(ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("agenda vazia!");
            return;
        }
        
        System.out.printf("\n%-20s | %-10s | %-15s\n", "Nome", "Telefone", "Email");

        for(int i = 0; i < lista.size(); i++){
            System.out.printf("\n%-20s | %-10s | %-15s\n", lista.get(i).getNome(), lista.get(i).getTelefone(), lista.get(i).getEmail());

        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>(); 

        int opcao;
        int opcao_editar;
        Contato edit = null;
        int indice;
        boolean removido = false;

        while(true){

            menuAgenda();
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 5){
                System.out.println("Programa encerrado");
                break;
            }
            
            switch(opcao){
                
                case 1 :
                    adicionarContato(scanner, lista);
                    break;

                case 2 :  
                    while(true){
                        System.out.println("Lista de contatos: ");
                        for(int i = 0; i < lista.size(); i++){
                            System.out.println(i + " - " + lista.get(i).getNome());
                            System.out.println("--------");
                        }
                        
                        
                        System.out.println("Qual contato deseja editar: ");
                        indice = scanner.nextInt();
                        scanner.nextLine();
                        
                        if(indice >= 0 && indice < lista.size()){
                             edit = lista.get(indice);
                        }
                        else{
                            System.out.println("Indice inválido!");
                            continue;
                        }
                        menuContato();
                        opcao_editar = scanner.nextInt();
                        scanner.nextLine();

                        if(opcao_editar == 3){
                            break;
                        }
                        
                        switch(opcao_editar){
                            
                            case 1 :
                                System.out.println("Edite o numero: ");
                                String new_telefone = scanner.nextLine();

                                edit.setTelefone(new_telefone);
                            
                                break;

                            case 2 :
                                System.out.println("Edite o email: ");
                                String new_email = scanner.nextLine();

                                edit.setEmail(new_email);
                            
                                break;

                            default : System.out.println("Escolha invalida!");
                        }

                                
                        }
                    break;
                case 3 : 

                    System.out.println("Lista de contatos: ");
                        for(int i = 0; i < lista.size(); i++){
                            System.out.println(i + "-" + lista.get(i).getNome());
                            System.out.println("--------");
                        }
                
                    System.out.println("Digite qual contato deseja excluir: ");
                    indice = scanner.nextInt();

                    if(indice >= 0 && indice < lista.size()){
                        for(int i = 0; i < lista.size(); i++){
                            if(indice == i){
                                lista.remove(i);
                                removido = true;

                                System.out.println("Contato removido!");
                            }
                        }
                        if(!removido){
                                System.out.println("Contato nao encontrado!");
                            }
                    }
                    break;
                case 4 : 
                    
                    listarContato(lista); 
                    break;   
                
             }

            }
        scanner.close();
        }
        


}