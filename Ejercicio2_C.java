import javax.swing.*;

public class Ejercicio2_C {

    public static void main(String[] args){
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese  numero A: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese  numero B: "));

        if (numero1 == numero2){
            JOptionPane.showMessageDialog(null,"los numeros A= "+numero1+ " B= "+numero2+ " Son iguales");
        }
        else {
            if (numero1 > numero2){
                JOptionPane.showMessageDialog(null, "El numero A es mayor ");
            }
            else {
                JOptionPane.showMessageDialog(null,"El numero B es Mayor");
            }
        }
    }
}
