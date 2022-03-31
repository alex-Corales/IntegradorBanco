package controlador;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import modelo.*;

public class CargaDatosInmueble {

    /**
     * carga en un archivo "casas.txt" los datos de la casa y si ese archivo no
     * existe lo crea
     *
     */
    public void cargaArchivoCasa(String dni, String antiguedad, String direccion, String valorTasacion, String cantAmbientes, String metrosCuadradosCubiertos, String metrosCuadradosTotales) {

        File archivo = new File("casas.txt");

        if (!archivo.exists()) { //Pregunta si el archivo existe
            try {
                archivo.createNewFile(); //Si no existe lo crea

                FileWriter escribir = new FileWriter(archivo, true);
                PrintWriter linea = new PrintWriter(escribir);

                linea.print( dni +"\r\n");
                linea.print( direccion +"\r\n");
                linea.print( valorTasacion  +"\r\n");
                linea.print( cantAmbientes +"\r\n");
                linea.print(  metrosCuadradosCubiertos +"\r\n");
                linea.print( metrosCuadradosTotales +"\r\n");
                linea.print( antiguedad +"\r\n");

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                System.err.println("Error");
            }
        } else {
            try {
                FileWriter escribir = new FileWriter(archivo, true);
                PrintWriter linea = new PrintWriter(escribir);

                linea.print( dni +"\r\n");
                linea.print( direccion +"\r\n");
                linea.print( valorTasacion  +"\r\n");
                linea.print( cantAmbientes +"\r\n");
                linea.print(  metrosCuadradosCubiertos +"\r\n");
                linea.print( metrosCuadradosTotales +"\r\n");
                linea.print( antiguedad +"\r\n");
                
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                System.err.println("Error");
            }
        }
    }

    public void cargarDepartamento(String dni, String direccion, String valorTasacion, String cantAmbientes, String metrosCuadradosCubiertos, String metrosCuadradosTotales, String piso, String numero) {
        File archivo = new File("departamentos.txt");

        if (!archivo.exists()) { //Pregunta si el archivo existe
            try {
                archivo.createNewFile(); //Si no existe lo crea

                FileWriter escribir = new FileWriter(archivo, true);
                PrintWriter linea = new PrintWriter(escribir);

                linea.print( dni +"\r\n");
                linea.print( direccion +"\r\n");
                linea.print( valorTasacion  +"\r\n");
                linea.print( cantAmbientes +"\r\n");
                linea.print(  metrosCuadradosCubiertos +"\r\n");
                linea.print( metrosCuadradosTotales +"\r\n");
                linea.print( piso +"\r\n");
                linea.print(numero +"\r\n");

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                System.err.println("Error");
            }
        } else {
            try {
                FileWriter escribir = new FileWriter(archivo, true);
                PrintWriter linea = new PrintWriter(escribir);

               linea.print( dni +"\r\n");
                linea.print( direccion +"\r\n");
                linea.print( valorTasacion  +"\r\n");
                linea.print( cantAmbientes +"\r\n");
                linea.print(  metrosCuadradosCubiertos +"\r\n");
                linea.print( metrosCuadradosTotales +"\r\n");
                linea.print( piso +"\r\n");
                linea.print(numero +"\r\n");

                linea.close();
                escribir.close();
            } catch (IOException ex) {
                System.err.println("Error");
            }
        }
    }
}
