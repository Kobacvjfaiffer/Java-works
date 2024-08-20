import javax.swing.*;

public class Ejercicio12_C {


        public static void main(String[] args) {
            // Pedir la nota mediante JOptionPane
            String notaStr = JOptionPane.showInputDialog("Ingrese una nota entre 0 y 10:");

            // Convertir la entrada a entero
            int nota = Integer.parseInt(notaStr);

            // Variable para almacenar la calificación
            String calificacion = "";

            // Clasificar la nota
            if (nota >= 0 && nota < 5) {
                calificacion = "Insuficiente";
            } else if (nota >= 5 && nota < 6) {
                calificacion = "Suficiente";
            } else if (nota >= 6 && nota < 7) {
                calificacion = "Bien";
            } else if (nota >= 7 && nota < 9) {
                calificacion = "Notable";
            } else if (nota >= 9 && nota <= 10) {
                calificacion = "Sobresaliente";
            } else {
                calificacion = "Nota fuera de rango.";
            }

            // Mostrar la calificación mediante JOptionPane
            JOptionPane.showMessageDialog(null, "Calificación: " + calificacion);
        }
    }


