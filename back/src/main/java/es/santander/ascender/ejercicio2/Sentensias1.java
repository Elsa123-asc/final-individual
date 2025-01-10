package es.santander.ascender.ejercicio2;

import java.util.Scanner;

public class Sentensias1 {
public static void main(String[] args) {
        //Sentencia if es cuando se esta ejecutando el programa.
        //Si durante la ejecucion hay un If entonces se ejecuta una accion.

        System.out.print("Que nota tienes: ");
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int nota =sc.nextInt();
            if (nota>5) {
        System.out.println("Has aprobado");
        }
        //if (nota<=5) {
           // System.out.println("No has aprobado");
        //} 
            else {
                System.out.println("hay que estudiar mas");
            }
    }
}
