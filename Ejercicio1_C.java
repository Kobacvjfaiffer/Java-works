import javax.swing.*;

public class Ejercicio1_C {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numero"));
        if (numero%10 == 0){
            JOptionPane.showMessageDialog(null,"El numero " +numero+ " es multiplo de 10");
        }
        else {
            JOptionPane.showMessageDialog(null,"El numero no el multiplo de 10 ");
            JOptionPane.showMessageDialog(null,"Sigue participando ");
        }
    }
}
