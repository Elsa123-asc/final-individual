package es.santander.ascender.ejercicio2;

import java.util.Scanner;

public class Nuevoejercici {
    public static void main(String[] args) {
        System.out.print("Ingresa la calificacion");
        @SuppressWarnings("resource")
        Scanner scanner= new Scanner(System.in);
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

                            // || el operador OR son dos patas para la condicion 1 o 2. Significa or. (o). 
                                } 
        if(calificacion<0 || calificacion>10);{
            System.out.println("datos invalidos");
                } 

    }


}
