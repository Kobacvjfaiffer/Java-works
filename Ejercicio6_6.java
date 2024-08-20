import javax.swing.*;

public class Ejercicio6_6 {
    public static void main(String[] args){
        int n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        if (n1 % 2 == 0 && n2 % 2 == 0){
            JOptionPane.showMessageDialog(null," Ambos numeros son PARES");

        }
        else  {
            JOptionPane.showMessageDialog(null,"Uno o ambos numeros NO SON PARES");

        }
    }
}
