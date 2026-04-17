public class caneta{
    String cor;
    Float ponta;
    Boolean tampa = true;

    public void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampa: " + this.tampa);
    }
    public void tampar(){
        this.tampa = true;
    }
    public void destampar(){
        this.tampa = false;
    }
    public void rabiscar(){
        if(tampa = true){
            System.out.println("Caneta tampada");
        }
        else{
            System.out.println("Posso rabiscar");
        }
    }
}