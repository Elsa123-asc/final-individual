package es.santander.ascender.ejercicio1;

import java.util.Scanner;

    public class Principal01 {
    public static void main(String[] args) {
        
    
    @SuppressWarnings("resource")
    Scanner sc=new Scanner(System.in);
        System.out.print("Por favor introduce la nota: ");

        int nota =sc.nextInt();

        System.out.println(nota*2);
    }
}
