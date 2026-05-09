 class Livro extends ItemBiblioteca {
    private String autor;
    private int paginas;

    public Livro(){}
    
    public Livro(String autor, String titulo, int paginas, int ano ){
        super(titulo, ano);
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override

    public String toString(){
        return super.toString() + " \nAutor: " + autor + " \nPaginas: " + paginas;
    }
    
}
