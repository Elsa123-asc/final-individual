package es.santander.ascender.ejercicio2;

import java.util.Scanner;

public class Operadorlog {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("que nota tienes: ");
        @SuppressWarnings("resource")
        Scanner scanner=new Scanner(System.in);
        int calificacion=scanner.nextInt();

        if (calificacion>=0 && calificacion<=3) {
            System.out.println("Tu calificacion fue muy mala");
          } 
            else if (calificacion>3 && calificacion<5) {
                System.out.println("hay que estudiar mas");
            } 
                else if (calificacion>5 && calificacion<7){
                    System.out.println("has hecho lo correcto");
                } 
                    else if (calificacion>=7 && calificacion<=9){
                        System.out.println("compramos el balon");
                    } 
                        else if (calificacion==10) {
                            System.out.println("Compramos el movil");
                                } 
    }

}
