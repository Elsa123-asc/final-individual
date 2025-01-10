package es.santander.ascender.ejercicio1;

import java.util.Scanner;

public class Principaleer {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor introduce la nota");

        int nota =sc.nextInt();
        System.out.print("la nota introducida es: ");
        System.out.println(nota);
    }
    
}