package ces.santander.ascender;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestionComprasTest {

    @Test
    public void testMostrarProductos() {
        // Datos de prueba
        int cantProductoTotal = 5;
        int codProducto[] = new int[] {1, 2, 3, 4, 5};
        String nombre[] = new String[] {"Clase_Azul_Tequila", "Casa_Dragones_Tequila", "Don_Julio_Tequila", "Patron_Tequila", "Jose_Cuervo_Tequila"};
        int precio[] = new int[] {490, 330, 240, 220, 150};


        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.PrintStream ps = new java.io.PrintStream(baos);
        System.setOut(ps); // redirigimos la salida estándar

        // Llamamos al método
        GestionCompras.mostrarProductos(codProducto, nombre, precio, cantProductoTotal);

        // Comprobamos que la salida es la esperada
        String expectedOutput = "1 - Clase_Azul_Tequila - 490\n" +
                                "2 - Casa_Dragones_Tequila - 330\n" +
                                "3 - Don_Julio_Tequila - 240\n" +
                                "4 - Patron_Tequila - 220\n" +
                                "5 - Jose_Cuervo_Tequila - 150\n";

        assertEquals(expectedOutput, baos.toString());

        System.setOut(System.out); // Restauramos la salida estándar
    }
}
