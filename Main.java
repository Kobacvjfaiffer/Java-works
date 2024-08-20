import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* operadores condicioneles
        == igual
        != diferente
        > mayor
        >= mayorigual
        < menor
        <= menorigual

         */
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int numero, dato = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if (numero == dato){
            JOptionPane.showMessageDialog(null,"El numero es 5 ");
        }
        else {
            JOptionPane.showMessageDialog(null,"El numero es diferente de 5 ");
        }
        }
    }
