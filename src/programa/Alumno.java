package programa;

public class Alumno extends Persona{

    private int matricula;
    private int año; //Acá sería el año en el que esta, ej: 6 (sexto)
    private String curso; //Acá el curso, ej: A
    private Materia materia; //Agregamos alguna materia en la que participa el alumno


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

    public Materia getMateria(){
        return materia;
    }

    public String setMateria(Materia materia){
        this.materia = materia;
        return "Se inscribio al alumno " + this.getNombre() +" " + this.getApellido() + " en la materia: " + this.getMateria();
    }
}
