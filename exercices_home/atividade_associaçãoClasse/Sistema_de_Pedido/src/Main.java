public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jorge", "Jorge@gmail.com", "Rua Ernesto Ferreira");
        Pedido p1 = new Pedido(1, 900.20, c1 ); 

        p1.ImprimirCliente();
    }
}
