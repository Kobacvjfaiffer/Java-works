import javax.swing.*;

public class Ejercicio4_C {
    public static void main(String[] args){
        double compraCliente, descuento, pagoFinal;

        compraCliente = Double.parseDouble(JOptionPane.showInputDialog("Ingrese monto de la boleta: "));

        if (compraCliente <= 300){
            JOptionPane.showMessageDialog(null,"Lo siento NO tienes descuento");
        }
        else {
            descuento = 0.2 * compraCliente;
            pagoFinal = compraCliente - descuento;

            JOptionPane.showMessageDialog(null,"Felicidad usted tiene un descuento del 20% ");
            JOptionPane.showMessageDialog(null,"Su pago final es : "+pagoFinal);
        }




    }
}
