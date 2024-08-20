//ejercicio1: hacer un programa que calcule e imprima la suma

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,suma;

        //guardamos ls tres notas
        System.out.print("Digita 3 calificaciones:");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        suma = nota1+nota2+nota3;//sumamos las tres notas

        System.out.println();
        System.out.println("la suma es: "+suma);


        }
    }
