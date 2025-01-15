package es.santander.ascender.ejercicio3;

import java.util.Scanner;

public class tablademultipli {
    public static void main(String[] args) {
        //vamos a realizar la tabla de mutiplicar del 2 con el metodo FOR.
      
        System.out.print("Ingresa el numero a multiplicar: ");
        @SuppressWarnings("resource")
        Scanner scanner= new Scanner(System.in);
        int NumeroMultiplicar=scanner.nextInt(); 
        for(int i=1;i<=10;i++){
           // System.out.println(i);
            System.out.println(i*NumeroMultiplicar);
        }
       
        
    }

}
