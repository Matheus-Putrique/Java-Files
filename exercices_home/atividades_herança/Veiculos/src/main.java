public class main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setMarca("Fiat");
        carro1.setAno(2013);
        carro1.setNumeroPortas(4);
        carro1.setTipoCombustivel("Gasolina");
        System.out.println(carro1);

        Moto moto1 = new Moto();

        moto1.setMarca("Yamaha");
        moto1.setAno(2018);
        System.out.println(moto1);
    
    }

}
