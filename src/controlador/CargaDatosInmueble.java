package controlador;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import modelo.*;

public class CargaDatosInmueble {

    public void cargaArchivoCasa(String dni, int antiguedad, String direccion, double valorTasacion, int cantAmbientes, double metrosCuadradosCubiertos, double metrosCuadradosTotales) {
        File archivo = new File("casas.txt");

        try {
            FileWriter escribir = new FileWriter(archivo, true);
            PrintWriter linea = new PrintWriter(escribir);

            linea.print("\r\n" + dni);
            linea.print("\r\n" + antiguedad);
            linea.print("\r\n" + direccion);
            linea.print("\r\n" + valorTasacion);
            linea.print("\r\n" + cantAmbientes);
            linea.print("\r\n" + metrosCuadradosCubiertos);
            linea.print("\r\n" + metrosCuadradosTotales);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public void cargaArchivoInmueble(String dni, int antiguedad, String direccion, double valorTasacion, int cantAmbientes, double metrosCuadradosCubiertos, double metrosCuadradosTotales) {
//
//        File archivo = new File("datos inmueble.txt");
//
//        if (!archivo.exists()) { //Pregunta si el archivo existe
//            try {
//                archivo.createNewFile(); //Si no existe lo crea
//
//                if (mapInmueble.containsKey(dni)) { //Busca que la palabra este en el mapa
//                    System.out.println("El dni se encuentra cargado");
//                } else {
//                    mapInmueble.put(dni, new Casa(antiguedad, direccion, valorTasacion, cantAmbientes, metrosCuadradosCubiertos, metrosCuadradosTotales));
//                    FileWriter escribir = new FileWriter(archivo, true);
//                    PrintWriter linea = new PrintWriter(escribir);
//
//                    linea.print("\r\n" + dni);
//                    linea.print("\r\n" + mapInmueble.get(dni).getDireccion());
//                    linea.print("\r\n" + mapInmueble.get(dni).getValorTasacion());
//                    linea.print("\r\n" + mapInmueble.get(dni).getCantAmbientes());
//                    linea.print("\r\n" + mapInmueble.get(dni).getMetrosCuadradosCubiertos());
//                    linea.print("\r\n" + mapInmueble.get(dni).getMetrosCuadradosTotales());
//
//                    linea.close();
//                    escribir.close();
//                }
//            } catch (IOException ex) {
//                System.err.println("Error");
//            }
//        } else {
//            try {
//                if (mapInmueble.containsKey(dni)) { //Busca que la palabra este en el mapa
//                    System.out.println("El dni se encuentra cargado");
//                } else {
//                    mapInmueble.put(dni, new Casa(antiguedad, direccion, valorTasacion, cantAmbientes, metrosCuadradosCubiertos, metrosCuadradosTotales));
//                    FileWriter escribir = new FileWriter(archivo, true);
//                    PrintWriter linea = new PrintWriter(escribir);
//
//                    linea.print("\r\n" + dni);
//                    linea.print("\r\n" + mapInmueble.get(dni).getDireccion());
//                    linea.print("\r\n" + mapInmueble.get(dni).getValorTasacion());
//                    linea.print("\r\n" + mapInmueble.get(dni).getCantAmbientes());
//                    linea.print("\r\n" + mapInmueble.get(dni).getMetrosCuadradosCubiertos());
//                    linea.print("\r\n" + mapInmueble.get(dni).getMetrosCuadradosTotales());
//
//                    linea.close();
//                    escribir.close();
//                }
//
//            } catch (IOException ex) {
//                System.err.println("Error");
//            }
//        }
//    }
}
