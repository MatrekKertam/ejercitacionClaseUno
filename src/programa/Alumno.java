package programa;

public class Alumno extends Persona{

    private int matricula;
    private int año; //Acá sería el año en el que esta, ej: 6 (sexto)
    private String curso; //Acá el curso, ej: A


    public Alumno(String nombre, String apellido, int edad, int matricula, int año, String curso) {
        super(nombre, apellido, edad);
        this.matricula = matricula;
        this.año = año;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
