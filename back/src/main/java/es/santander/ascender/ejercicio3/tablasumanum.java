package es.santander.ascender.ejercicio3;

import java.util.Scanner;

public class tablasumanum {
    public static void main(String[] args) {
        System.out.print("Ingresa el numero a sumar: ");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int sumar = scanner.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(i+sumar);
            
        }
    }

}
