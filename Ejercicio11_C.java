import javax.swing.*;

public class Ejercicio11_C {
    public static void main(String[] args){

        int number1, number2, suma, rest, div, prod;
        char action;

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Input number A: "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Input number B: "));

        action = JOptionPane.showInputDialog("Input Action: ").charAt(0);

        switch (action){
                case 's':
                case  'S':suma = number1+number2;
                   JOptionPane.showMessageDialog(null,"El Resultado de la suma es: "+suma);
                break;

            case 'r':
            case 'R':rest = number1-number2;
                JOptionPane.showMessageDialog(null,"El Resultado de la Resta es: "+rest);
                break;

            case 'p':
            case 'P':
            case 'm':
            case 'M':prod = number1*number2;
                JOptionPane.showMessageDialog(null,"El Resultado de la Multiplicacion es: "+prod);
                break;
            case 'd':
            case 'D':div = number1/number2;
                JOptionPane.showMessageDialog(null,"El Resultado de la Divicion es: "+div);
                break;
            default:JOptionPane.showMessageDialog(null,"ERROR EN ACTION DIGITADA");
                    break;


        }
    }
}
