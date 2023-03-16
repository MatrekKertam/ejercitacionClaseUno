package programa;

public class Materia {

    private String nombre;
    private int clases;

    public Materia(String nombre, int clases) {
        this.nombre = nombre;
        this.clases = clases;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClases(){
        return clases;
    }

    public void setClases(int clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return  "La materia " + this.getNombre() + " tiene " + this.getClases() + " clases";
    }
}
