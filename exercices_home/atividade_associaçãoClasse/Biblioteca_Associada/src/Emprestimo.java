public class Emprestimo {
    private String dataEmprestimo;
    private Livro livro;
    private Cliente cliente;

    Emprestimo(){}

    Emprestimo(String dataEmprestimo, Livro livro, Cliente cliente){
        this.dataEmprestimo = dataEmprestimo;
        this.livro = livro;
        this.cliente = cliente;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override

    public String toString(){
        return "Cliente: " + cliente.getNome() + "\n" + "Idade: " + cliente.getIdade() + "\n" + "Livro: " + livro.getTitulo() + "\n" + "Autor: " + livro.getAutor() + "\n" + "Data de emprestimo: " + getDataEmprestimo();
    }
    
}
