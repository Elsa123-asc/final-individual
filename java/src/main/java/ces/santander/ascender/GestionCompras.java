package.ces.santander.ascender.GestionCompras;

import java.util.Scanner;

public class GestionCompras {
     public static void main(String[] args) {
            int cantProductoTotal = 5
            int idProducto[] = new int[] {1,2,3,4,5};
            string nombres[] = new string[] {Clase_Azul_Tequila,Casa_Dragones_Tequila,Don_Julio_Tequila,Patron_Tequila,Jose_Cuervo_Tequila};
            int precio [] = new int[] {490,330,240,220,150};
            int cantidad [] = new int[] {15,20,18,25,40};

            Scanner teclado = new Scanner(System.in);

            int codProductoCarrito[] = new int[10];
            int cantProductoCarrito [] = new int[10];
            int subtProductoCarrito [] = new int[10];

            int cantProductoCarrito = 0; //el carro esta vacio

            int op; //menu de opciones

                    do {
                        System.out.println("Menu de opciones");
                        System.out.println("=================");
                        System.out.println("1 - mostrar producto");
                        System.out.println("2 - mostrar carrito");
                        System.out.println("3 - agregar producto");
                        System.out.println("4- salir");
                        System.out.println("Ingresar opcion deseada: ");
                        op = teclado.nextInt();

                    switch (op) {
                        case 1:mostrarProductos(codProductoCarrito,nombres,precio,cantProductoTotal); 
                        //llamar a muestra productos
                            
                            break;
                        case 2: mostrarCarrito(cantProductoCarrito,nombres,precio,subtProductoCarrito);
                        //llamar a muestra carrito
                             

                        case 3: subtProductoCarrito(cantProductoCarrito,nombres,precio,cantProductoTotal)

                            break;
                         //llamar a muestra carrito
                    }       

                  
         }                  while (op!=4);
                             //llamar a muestra de producto
                            //calcular el total
                             //mostrar el total

    } 
    public static void mostrarProductos (int[] cp, String[] np, int[] pp int cantp) {
     int= i;
     System.out.println();
     System.out.println("Menu de opciones");
     System.out.println("================");
     for (i=0; i<cantp;i++) {
            System.out.println(cp[i] + " - " + np[i] + " - "+ pp [i]);
        
    }

    public static void mostrarCarrito (int[] cp, String[] np, int[] pp int cantp) {
        int= i;
        System.out.println();
        System.out.println("Menu de opciones");
        System.out.println("================");
        for (i=0; i<cantp;i++) {
               System.out.println(cp[i] + " - " + np[i] + " - "+ pp [i]);
           
       }
    
       public static void mostrarAgregarCarrito (int[] cp, String[] np, int[] pp int cantp) {
        int= i;
        System.out.println();
        System.out.println("Menu de opciones");
        System.out.println("================");
        for (i=0; i<cantp;i++) {
               System.out.println(cp[i] + " - " + np[i] + " - "+ pp [i]);
           
       }


}

    











