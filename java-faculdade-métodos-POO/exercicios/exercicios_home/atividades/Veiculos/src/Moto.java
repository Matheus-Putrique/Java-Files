public class Moto extends Veiculos {
    private int cilindradas;

    Moto(){}
    
    Moto( String marca, int ano,int cilindradas){
        super(marca, ano);
        this.cilindradas = cilindradas;
    }
    

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
    @Override
    public String toString(){
        return super.toString() + " Cilindradas: " + cilindradas;
    }
}
