public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Maria", 24);
        Livro l1 = new Livro("Machado de Assis", "Quincas Borba");
        Emprestimo e1 = new Emprestimo("19/07/2026", l1, c1);

        System.out.println(e1);
    }
}
