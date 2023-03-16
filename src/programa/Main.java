package programa;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Materia Historia = new Materia("Historia");
        Materia Politica = new Materia("Politica");
        Materia educacionFisica = new Materia("Eduacion Fisica");
        Materia Arte = new Materia("Arte");
        Materia Informatica = new Materia("Informatica");

        Profesor gamalielQuiroz = new Profesor("Gamaliel Natanael","Quiroz", 24, Informatica, 1, 5, 2, "A");

        Alumno matiasBernal = new Alumno("Matias", "Bernal", 22, 1505, 2, "A");

        System.out.println(matiasBernal.setMateria(Informatica));
        JOptionPane.showMessageDialog(null, matiasBernal.setMateria(Informatica));
    }
}
