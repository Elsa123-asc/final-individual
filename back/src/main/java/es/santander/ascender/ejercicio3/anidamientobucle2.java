package es.santander.ascender.ejercicio3;

public class anidamientobucle2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int divisibles3=0;
        
        for (int i=1; i<=100;i++) {
        System.out.println(i);
        if (i%3==0) {
            divisibles3++;
        }
    
    }
    // cuantos numeros dividubles entre tres hay en los prmeros 100 numeros
    System.out.println("-----------------");
    System.out.println(divisibles3);
    }
}

//el resultado de los 100 numeros tenemos 33 numeros que se pueden dividir entre 3 y dan 0
