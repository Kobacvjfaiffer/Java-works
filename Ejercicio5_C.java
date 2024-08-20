import javax.swing.*;

public class Ejercicio5_C {

    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioTotal;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingresar horas trabajadas: "));

        if (horasTrabajadas <= 40) {
            salarioTotal = horasTrabajadas * 16;

        }
        else {
            salarioTotal = (40*16) + ((horasTrabajadas -40) * 20);
            JOptionPane.showMessageDialog(null,"Su salario total es: "+salarioTotal);
        }
    }
}