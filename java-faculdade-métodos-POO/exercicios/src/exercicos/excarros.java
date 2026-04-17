public class excarros {
    
    public static void main(String[] args) {
        carros c1 = new carros();

        c1.marca = "Toyota";
        c1.modelo = "Corolla";
        c1.ligado = true;
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.status();
        c1.frear();
        c1.status();

        carros c2 = new carros();

        c2.marca = "Volkswagen";
        c2.modelo = "Gol";
        c2.ligado = true;
        c2.acelerar();
        c2.status();
        c2.desligar();
        c2.acelerar();
        c2.status();
    }
}
