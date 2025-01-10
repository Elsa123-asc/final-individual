package es.santander.ascender.ejercicio2;

import java.util.Scanner;

public class Sentencia3 {
public static void main(String[] args) {
    System.out.print("Ingresa la cantidad de producto: ");
    @SuppressWarnings("resource")
    Scanner scanner=new Scanner(System.in);
        int tequila=scanner.nextInt();
    if (tequila==0) {
        System.out.println("Producto agotado");
    }
    if (tequila<=5) {
        System.out.println("Realizar pedido de producto");
    } else { 
        System.out.println("Producto en existencia");
        }

    if (tequila>=25){
        System.out.println("Lanzar promocion");
    }
        // else { 
           // System.out.println("Producto en existencia");
         // }
    }
       
}
