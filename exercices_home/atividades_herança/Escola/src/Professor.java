public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    Professor(){}

    Professor(String nome, int idade, String especialidade, double salario){
        super(nome, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override

    public String toString(){
        return super.toString() + " Especialidade: " + especialidade + " salario: R$" + salario;
    }
}
