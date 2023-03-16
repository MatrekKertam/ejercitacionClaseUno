package programa;

public class Main {
    public static void main(String[] args) {

        Materia Historia = new Materia("Historia");
        Materia Politica = new Materia("Politica");
        Materia educacionFisica = new Materia("Eduacion Fisica");
        Materia Arte = new Materia("Arte");
        Materia Informatica = new Materia("Informática");

        Profesor gamalielQuiroz = new Profesor("Gamaliel Natanael","Quiroz", 24, Informatica, 1, 5, 2, "A");

        Alumno matiasBernal = new Alumno("Matías", "Bernal", 22, 1505, 2, "A");
    }
}
