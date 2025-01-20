package es.santander.ascender.ejercicio3;

public class factorial1 {
    public static void main(String[] args) {
        //factorial es el 5!  5x4x3x2x1=120
        // in factorial es igual a 1, no puede ser cero porque la multiplicacion daria cero.

        int factorial=1;

        for (int i=1;i<=5;i++) {

            factorial= factorial*i;
            System.out.println("interacion : " +i);
            System.out.println("factorial de interacion: " +factorial);
        }  
        System.out.println("factorial final: " +factorial);
    }

}
