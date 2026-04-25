import java.util.*;

public class Login{
    
     public static void menu(){
        System.out.println("Seja bem vindo ao nosso sistema!");
        System.out.println("[1] Cadastrar");
        System.out.println("[2] Login");
        System.out.println("[3] Sair");
        System.out.println("Opção: ");
    }

    public static void cadastro(Scanner scanner, ArrayList<OBJ_Cadastro> usuario){
        String cpf;

        while(true){
            boolean existe_cpf = false;
            
            System.out.println("CPF: ");
            cpf = scanner.nextLine();

            for(int i = 0; i < usuario.size();i++){
                if(usuario.get(i).getCpf().equals(cpf)){
                    existe_cpf = true;
                    break;
                }
            }
            if(existe_cpf){
                System.out.println("Cpf já cadastrado! Digite outro ");
            }
            else{
                break;
            }
        }

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Ultimo sobrenome: ");
        String sobrenome = scanner.nextLine();

        String email;

        while(true){
            boolean existe_email = false;
            
            System.out.println("Email: ");
            email = scanner.nextLine();

            for(int i = 0; i < usuario.size();i++){
                if(usuario.get(i).getEmail().equals(email)){
                    existe_email = true;
                }
            }
            if(existe_email){
                System.out.println("Email já cadastrado! Digite outro");
            }
            else{
                break;
            }
        }

        String senha;
        String repetirSenha;

        while(true){
            System.out.println("Senha: ");
            senha = scanner.nextLine();

            System.out.println("Repetir senha: ");
            repetirSenha = scanner.nextLine();

            if(senha.equals(repetirSenha)){
                System.out.println("Cadastro feito com sucesso!");
                break;
            }
            else{
                System.out.println("As senhas não coincidem!");
            }
        }
        usuario.add(new OBJ_Cadastro(cpf, nome, sobrenome, email, senha));
    }
    public static void login(Scanner scanner, ArrayList<OBJ_Cadastro> usuario){
        System.out.println("Email ou CPF: ");
        String email_cpf = scanner.nextLine();

        System.out.println("Senha: ");
        String senha = scanner.nextLine();

        boolean encontrado = false;

        for(int i = 0; i < usuario.size(); i++){
            if((usuario.get(i).getEmail().equals(email_cpf) || usuario.get(i).getCpf().equals(email_cpf))  && usuario.get(i).getSenha().equals(senha)){
                System.out.println("Login efetuado com sucesso");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
                System.out.println("Usuario ou senha incorretos");
        }
    }
    public static void main(String[] args) {
        ArrayList<OBJ_Cadastro> usuario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        while(true){
            menu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 3){
                System.out.println("Programa finalziado!");
                break;
            }
            
            switch(opcao){
                
                case 1:
                    cadastro(scanner, usuario);
                    break;
                
                case 2:
                    login(scanner, usuario);
                    break;

                default:
                    System.out.println("Erro no sistema! tente novamente!");
                    break;
            }
        }

    }
}