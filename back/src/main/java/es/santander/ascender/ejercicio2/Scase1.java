package es.santander.ascender.ejercicio2;

import java.util.Scanner;

public class Scase1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Ingresa el dia de la semana: ");
        @SuppressWarnings("resource")
        Scanner scanner= new Scanner(System.in);
        final String dia = scanner.next();
      // String dia="martes";
        switch (dia) {
                case "lunes":
                System.out.println("que pena");
                
                break;
                case "martes":
                System.out.println("vamos avanzando la semana");
                
                break;
                case "miercoles":
                System.out.println("mitad de semana");
                
                break;
                case "jueves":
                System.out.println("ya estamos terminando");
                
                break;
                case "viernes":
                System.out.println("lista para la fiesta");
                
                break;
                case "sabado":
                System.out.println("a tope");
                
                break;
               
        
            default:
                System.out.println("volvemos al ruedo");
                break;

        }
        
    }

    @Override
    public String toString() {
        return "Scase1 []";
    }

}
