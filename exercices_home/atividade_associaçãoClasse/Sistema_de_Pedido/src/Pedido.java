public class Pedido {
    private int numero;
    private double valor;
    private Cliente cliente;

    Pedido(){}

    Pedido(int numero, double valor, Cliente cliente){
        this.numero = numero;
        this.valor = valor;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void ImprimirCliente(){
        System.out.println("Pedido:" + getNumero());
        System.out.println("Valor: " + getValor());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Endereço: " + cliente.getEndereco());
    }
}
