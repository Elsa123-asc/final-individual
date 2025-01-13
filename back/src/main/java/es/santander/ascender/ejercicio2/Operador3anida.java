package es.santander.ascender.ejercicio2;

import java.util.Scanner;

public class Operador3anida {
public static void main(String[] args) {
    boolean oferta=false;
    
    System.out.println("Ingresa la nota");
    @SuppressWarnings("resource")
    Scanner scanner= new Scanner(System.in);
        int calificacion = scanner.nextInt();
        System.out.println("EStamos de oferta");
        oferta=scanner.nextBoolean();
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
                            //Anidamiento activo el Boleando en la perte superior y posteriormente inserto la oferta.
                        if (oferta) {
                            System.out.println("con auriculares");
                            
                        }


                            // || el operador OR son dos patas para la condicion 1 o 2. Significa or. (o). 
                                } 
        if(calificacion<0 || calificacion>10);{
            System.out.println("datos invalidos");
                } 

    }

}


