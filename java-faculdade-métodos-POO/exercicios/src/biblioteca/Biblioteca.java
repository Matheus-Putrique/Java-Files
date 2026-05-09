public class Biblioteca{
    public static void main(String[] args) {
        Livro l1 = new Livro();
        
        l1.setTitulo("O cavaleiro preso na armadura");
        l1.setAno(1993);
        l1.setAutor("Robert Fisher");
        l1.setPaginas(128);

        System.out.println(l1);

        DVD d1 = new DVD();

        d1.setTitulo("Matrix");
        d1.setAno(1999);
        d1.setCategoria("Ficcao Cientifica");
        d1.setDuracao(136);

        System.out.println(d1);
    }
}