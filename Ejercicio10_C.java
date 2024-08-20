import java.util.Scanner;

public class Ejercicio10_C {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedir día, mes y año
            System.out.print("Ingrese el día: ");
            int dia = scanner.nextInt();

            System.out.print("Ingrese el mes: ");
            int mes = scanner.nextInt();

            System.out.print("Ingrese el año: ");
            int anio = scanner.nextInt();

            // Variable para almacenar si la fecha es válida
            boolean fechaValida = false;

            // Validar el mes
            if (mes >= 1 && mes <= 12) {
                // Validar los días del mes
                switch (mes) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        // Meses con 31 días
                        if (dia >= 1 && dia <= 31) {
                            fechaValida = true;
                        }
                        break;
                    case 4: case 6: case 9: case 11:
                        // Meses con 30 días
                        if (dia >= 1 && dia <= 30) {
                            fechaValida = true;
                        }
                        break;
                    case 2:
                        // Febrero con 28 días
                        if (dia >= 1 && dia <= 28) {
                            fechaValida = true;
                        }
                        break;
                }
            }

            // Mostrar si la fecha es válida o no
            if (fechaValida) {
                System.out.println("La fecha es correcta.");
            } else {
                System.out.println("La fecha es incorrecta.");
            }

            scanner.close();
        }
    }


