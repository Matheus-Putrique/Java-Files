public class excaneta {
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.rabiscar();
        c1.status();

        caneta c2 = new caneta();

        c2.cor = "Vermelha";
        c2.ponta = 0.75f;
        c2.status();
    }
}
