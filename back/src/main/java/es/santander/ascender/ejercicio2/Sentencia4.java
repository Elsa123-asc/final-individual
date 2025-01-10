package es.santander.ascender.ejercicio2;

import java.util.Scanner;

public class Sentencia4 {
public static void main(String[] args) {
    System.out.print("Ingresa el resultado obtenido: ");
    @SuppressWarnings("resource")
    Scanner scanner=new Scanner(System.in);
       int calificaciones =scanner.nextInt();
    if (calificaciones>=9) {
        System.out.println("Felicidades, te has ganado un balon");
    }
    else if (calificaciones==5) {
        System.out.println("Sigue adelante");
    }
    if (calificaciones>5) {
        System.out.println("Importante mejorar, estudiar mas");
    } 
    else { 
        System.out.println("No te has ganado un balon");
    }
    if (calificaciones<5) {
        System.out.println("Lo siento, tienes que estudiar mas, no aprobado");
    }
        else { 
            System.out.println("No te has ganado un balon");
        }
    }
}
