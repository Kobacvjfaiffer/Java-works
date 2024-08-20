import javax.swing.*;

public class Ejercicio9_C {
    public static void main(String[] args) {
        int day, month, year;
        day = Integer.parseInt(JOptionPane.showInputDialog("Input Day: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Input Month: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Input Year: "));

        if ((day >= 1) && (day <= 30)) {
            if ((month >= 1) && (month <= 12)) {
                if (year != 0) {
                    JOptionPane.showMessageDialog(null, "Date is GOOD");
                    JOptionPane.showMessageDialog(null,"DATE: "+day+"/"+month+"/"+year);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong date year invalied");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Wrong date Month invalied");
            }
        }
                else {
                JOptionPane.showMessageDialog(null, "Wrong date Day invalied");
                }
        }
    }

