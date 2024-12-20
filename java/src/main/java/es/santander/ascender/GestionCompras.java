package es.santander.ascender;

import java.util.Scanner;

public class GestionCompras {
    public static void main(String[] args) {
            int cantProductoTotal = 5;
            int codProducto[] = new int[] {1,2,3,4,5};
            String nombre[] = new String[] {"Clase_Azul_Tequila","Casa_Dragones_Tequila","Don_Julio_Tequila","Patron_Tequila","Jose_Cuervo_Tequila"};
            int precio [] = new int[] {490,330,240,220,150};
            int cantidad [] = new int[] {15,20,18,25,40};

            Scanner teclado = new Scanner(System.in);

            int codProductoCarrito[] = new int[10];
            int cantProductoCarrito [] = new int[10];
            int subtProductoCarrito [] = new int[10];

            int cantProductolinea = 0; //el carro esta vacio

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
                        case 1:
                        mostrarProductos(codProducto,nombre,precio,cantProductoTotal); 
                        //llamar a muestra producto
                            break;

                        case 2: 
                        int sumaTotal = mostrarCarrito(codProducto, nombre, precio, 
                        codProductoCarrito, cantProductoCarrito, subtProductoCarrito, cantProductolinea);
                        System.out.println("El total es: " + sumaTotal);
                        //llamar a muestra carrito
                            break;

                        case 3: 
                        if (cantProductolinea < 9) {
                            cantProductolinea = agregarCarrito(codProducto, nombre, precio, codProductoCarrito, cantProductoCarrito, 
                            subtProductoCarrito, cantProductolinea, teclado);
                        } 

                            else   {
                                System.out.println("El carrito esta lleno");
                            }
                            break;     
                        
                    }       

                 }                 
                        while (op!=4);
                        int sumaTotal  = mostrarCarrito(codProducto, nombre, precio, 
                        codProductoCarrito, cantProductoCarrito,subtProductoCarrito,cantProductolinea);
                        System.out.println("El total es: " + sumaTotal);
                             //llamar a muestra de producto
                             //calcular el total
                             //mostrar el total

        } 
                            public static void mostrarProductos (int[] costProducto, String[] nombreProducto, int[] precioProducto, int cantidadProducto) {
                            System.out.println();
                            System.out.println("Menu de opciones");
                            System.out.println("================");
                            for (int i=0; i<cantidadProducto;i++) {
                                System.out.println(costProducto[i] + " - " + nombreProducto[i] + " - "+ precioProducto [i]);
                                    }      
                                    
                                }

                            public static int mostrarCarrito (int[] costProducto, String[] nombreProducto, int[] precioProducto,
                            int[] cantProducto_linea, int[] cantProductolinea, int[] subt, int cantidadProducto) {
                            int suma = 0;
                            System.out.println();
                            System.out.println("Carrito de compras");
                            System.out.println("================");

                            for (int i = 0; i < cantProductolinea.length;i++) {
                                    int h = buscarProd(cantProducto_linea[i], costProducto); // Llamar la busqueda de productos
                                    if (h != -1) { 
                                    System.out.println(costProducto[h] + " - " + nombreProducto[h] + " - " +
                                        cantProductolinea[i] + " - "+ subt[i]);
                                        suma = suma + subt[i];
                                        } 
                                        else {
                                        System.out.println("Producto no encontrado en la posición " + i);
                                             }
                                        } 
                                        return suma;     
                                }           
                                    
                                public static int buscarProd(int[] codProducto, int[] costProducto) {
                                    int posicion = -1;
                                        for (int i = 0; i<costProducto.length;i++) {
                                        if (codProducto[i] == codProducto[i]) {
                                            posicion = i;
                                            break;
                                        }     
                            
                                    }
                                return posicion;
                                   
                            } 
                                                    
                                public static int agregarCarrito (int[] costProducto, String[] nombreProducto, int[] precioProducto,
                                    int[] cantProducto_linea, int cantProductolinea, int[] subt, int antProductolinea, 
                                    Scanner teclado) {
                                        System.out.println("Ingrese el codigo del producto deseado: ");
                                        int codProducto = teclado.nextInt();

                                    int posicion = buscarProd(codProducto, costProducto);

                                        if ( posicion == -1) {
                                        System.out.println("Producto no disponible!");
                                        return cantProductolinea;
                                        }
                                        System.out.println("Ingrese la cantidad deseada: ");

                                    int cantidad = teclado.nextInt();

                                        cantProducto_linea[cantProductolinea] = codProducto;
                                        subt[cantProductolinea] = precioProducto[posicion] * cantidad;
                                        cantProductolinea++;
                                        return cantProductolinea;
                                    }
                                                                
}



    











