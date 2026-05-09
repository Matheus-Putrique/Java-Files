
class OBJ_Cadastro{

    private String cpf;
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;

    public OBJ_Cadastro (String cpf, String nome, String sobrenome, String email, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
    }
    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
 }