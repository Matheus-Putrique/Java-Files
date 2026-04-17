class Contato {

    private String nome;
    private String email;
    private String telefone;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public String getNome(){
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}