public class Veiculos{
    private String marca;
    private int ano;

    public Veiculos() {
}
    
    Veiculos(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    @Override
    public String toString(){
        return "Marca: " + marca +
        " Ano: " + ano;
    }
}