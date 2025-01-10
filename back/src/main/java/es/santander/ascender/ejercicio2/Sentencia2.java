package es.santander.ascender.ejercicio2;

import java.util.Scanner;

public class Sentencia2 {
public static void main(String[] args) {
    System.out.print("Ingresa la calificacion: ");
    @SuppressWarnings("resource")
    Scanner sc=new Scanner(System.in);
    int nota =sc.nextInt();
    if (nota>5) {
        System.out.println("has aprobado");
    }
    if (nota<=5) {
        System.out.println("No has aprobado");
    }
    if (nota==0) {
        System.out.println("Suspenso");
    }
}

}
