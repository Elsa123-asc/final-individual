package es.santander.ascender.ejercicio3;

import java.util.Scanner;

public class ejerciciosumar2 {
    public static void main(String[] args) {
        System.out.print("Ingresa el numero a sumar: ");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        //int sumar = scanner.nextInt();
        int suma = scanner.nextInt();
      // int suma=0;

        for(int i=1;i<=10;i++) {
           System.out.println("interacion: "+i);
           suma= suma+i;
           System.out.print("suma actual: "+ suma);
        }
           System.out.println("total: " + suma);
            
        
    }

}


