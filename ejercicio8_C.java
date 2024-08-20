import javax.swing.*;

public class ejercicio8_C {
    public static void main(String[] args) {
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 0 y 99 999"));
        if(n<10 && n>=0) {
            JOptionPane.showMessageDialog(null, n + " tiene una cifra.");
        }
        else if(n<100&&n>=0) {
            JOptionPane.showMessageDialog(null, n + " tiene dos cifras.");
        }
        else if(n<1000&&n>=0) {
            JOptionPane.showMessageDialog(null, n + " tiene tres cifras.");
        }
        else if(n<10000&&n>=0) {
            JOptionPane.showMessageDialog(null, n + " tiene cuatro cifras.");
        }
        else if(n<100000&&n>=0) {
            JOptionPane.showMessageDialog(null, n + " tiene cinco cifras.");
        }
        else {
            JOptionPane.showMessageDialog(null, n + " está fuera del rango.");
        }
    }
 }

