public class exlivro {
    public static void main(String[] args) {
        livro l1 = new livro();

        l1.titulo = "Memórias Póstumas de Brás Cubas";
        l1.autor = "Machado de Assis";
        l1.ano = 1881;
        l1.exibirInfo();

        livro l2 = new livro();
        
        l2.titulo = "Dom Casmurro";
        l2.autor = "Machado de Assis";
        l2.ano = 1899;
        l2.exibirInfo();
    }
}
