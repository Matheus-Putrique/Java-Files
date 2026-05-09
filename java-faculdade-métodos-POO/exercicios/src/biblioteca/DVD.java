public class DVD extends ItemBiblioteca {
    private String categoria;
    private int duracao;

    public DVD(){}
    
    public DVD(String categoria,String titulo, int duracao, int ano ){
        super(categoria, duracao);
        this.categoria = categoria;
        this.duracao = duracao;
    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

        @Override

    public String toString(){
        return super.toString() + " \nCategoria: " + categoria + " \nDuracao: " + duracao;
    }
}
