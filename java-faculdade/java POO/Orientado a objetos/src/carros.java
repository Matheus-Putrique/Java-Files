public class carros {
    String marca;
    String modelo;
    int velocidade = 0;
    boolean ligado;

    public void ligar(){
        ligado = true;
        System.out.println("Ligado!");
    }
    public void desligar(){
        ligado = false;
        System.out.println("Desligado!");
    }
    public void acelerar(){
        if(ligado = true){
            velocidade += 10;
        }
        else{
            System.out.println("Carro desligado! Impossível acelerar");
        }
    }
    public void frear(){
        if(ligado = true){
            velocidade -= 10;
        }
        else{
            System.out.println("Carro desligado! Impossível frear");
        }
    }
    public void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        if(ligado = true){
            System.out.println("Ligado");
        }
        else{
            System.out.println("Desligado");
        }
        System.out.println("Velocidade: " + this.velocidade);
    }
}
