public class Carro extends Veiculos{
    private int numeroPortas;
    private String tipoCombustivel;
    
    Carro(){
        
    }
    
    Carro(String marca, int ano, int numeroPortas, String tipoCombustivel){
        super(marca, ano);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String toString(){
        return super.toString() + " Numero de portas: " + numeroPortas + " Tipo de combustivel: " + tipoCombustivel;
    }
}
