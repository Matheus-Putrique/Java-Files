import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();
        int menu;
       
        System.out.println("----Menu----");
        System.out.println("[1] Adicionar Aluno");
        System.out.println("[2] Listar Alunos");
        System.out.println("[3] Buscar Alunos");
        System.out.println("[4] Remover Aluno");
        System.out.println("[5] Sair");
       
       
        do{
            System.out.println("Escolha a opcao: ");
            menu = scanner.nextInt();
           
            switch(menu){
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    alunos.add(scanner.next());
                    System.out.println("Aluno adicionado com sucesso");
                    continue;
                case 2:
                    System.out.println("Alunos cadastrados");
                    if(alunos.isEmpty()){
                        System.out.println("nenhum aluno cadastrado");
                    }
                    Collections.sort(alunos);
                    System.out.println(alunos);
                    continue;
                case 3:
                    for(String aluno : alunos){
                        System.out.println("Digite o nome do aluno para buscar: ");
                        aluno = scanner.next();
                       
                        if(alunos.contains(aluno)){
                            System.out.println("Aluno encontrado");
                            break;
                        }
                        else{
                            System.out.println("Aluno nao encontrado");
                            break;
                        }
                    }
                case 4:
                    for(String aluno : alunos){
                        System.out.println("Digite o nome do aluno para remover: ");
                        aluno = scanner.next();
                        if(alunos.contains(aluno)){
                            alunos.remove(aluno);
                            System.out.println("Aluno foi removido");
                            break;
                        }
                        else{
                            System.out.println("Aluno nao encontrado");
                            break;
                        }
                    }
                default:
                    System.out.println("voce saiu do menu");
                    break;
                   
            }
        }while(menu > 0 && menu < 5);
    }
}

