package programa;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Creacion de materias
        Materia Historia = new Materia("Historia");
        Materia Politica = new Materia("Politica");
        Materia educacionFisica = new Materia("Eduacion Fisica");
        Materia Arte = new Materia("Arte");
        Materia Informatica = new Materia("Informatica");

        //Se crea un profesor
        Profesor gamalielQuiroz = new Profesor("Gamaliel Natanael","Quiroz", 24, Informatica, 1, 5, 2, "A");

        //Se crea un alumno
        Alumno matiasBernal = new Alumno("Matias", "Bernal", 22, 1505, 2, "A");

        //Probando mensajes
        JOptionPane.showMessageDialog(null, matiasBernal.setMateria(Informatica));
        JOptionPane.showMessageDialog(null, matiasBernal);
    }
}
