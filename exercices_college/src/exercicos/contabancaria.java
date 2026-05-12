public class contabancaria {
    String titular;
    double saldo = 0;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depositado");
    }
    public void sacar(double valor){
        if(saldo > valor){
            saldo -= valor;
            System.out.println("Sacado");
        }
    }
    public void MostrarSaldo(){
        System.out.println(this.titular + " Após todas as transações o saldo ficou de " + this.saldo);
    }
}
