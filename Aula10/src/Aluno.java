public class Aluno extends Pessoa {
    //ATRIBUTOS
    private int matricula;
    private String curso;

    //METODOS
    public void cancelarMatricula(){
        System.out.println("Matricula será cancelada");
    }

    //METODOS ESPECIAIAS

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
