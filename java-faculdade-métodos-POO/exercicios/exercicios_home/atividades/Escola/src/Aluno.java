public class Aluno extends Pessoa{
    private String matricula;
    private String curso;

    Aluno(){}

    Aluno(String nome, int idade, String matricula, String curso){
        super(nome,idade);
        this.matricula = matricula;
        this.curso = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override

    public String toString(){
        return super.toString() + " matricula: " + matricula + " curso: " + curso;
    }
}