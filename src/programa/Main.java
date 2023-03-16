package programa;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Creacion de materias
        Materia Historia = new Materia("Historia", 22);
        Materia Politica = new Materia("Politica", 33);
        Materia educacionFisica = new Materia("Eduacion Fisica", 25);
        Materia Arte = new Materia("Arte", 44);
        Materia Informatica = new Materia("Informatica", 18);

        //Se crea un profesor
        Profesor gamalielQuiroz = new Profesor("Gamaliel Natanael","Quiroz", 24, Informatica, 1, 5, 2, "A");
        Profesor pepitoQuiroga = new Profesor("Pepito", "Quiroga", 46, Arte, 1, 8, 6, "B");

        //Se crea un alumno
        Alumno matiasBernal = new Alumno("Matias", "Bernal", 22, 1505, 2, "A");
        Alumno fulanoRodriguez = new Alumno("Fulano", "Rodriguez", 24, 5051, 6, "B");

        //Probando mensajes
        JOptionPane.showMessageDialog(null, matiasBernal.setMateria(Informatica));
        JOptionPane.showMessageDialog(null, matiasBernal);
        JOptionPane.showMessageDialog(null, fulanoRodriguez.setMateria(Arte));
        JOptionPane.showMessageDialog(null, fulanoRodriguez);
        JOptionPane.showMessageDialog(null, pepitoQuiroga);
        JOptionPane.showMessageDialog(null, gamalielQuiroz);
    }
}
