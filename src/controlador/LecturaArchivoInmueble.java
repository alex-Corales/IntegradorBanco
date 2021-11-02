package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import modelo.Casa;
import modelo.Departamento;
import modelo.Propiedad;

public class LecturaArchivoInmueble {

    HashMap<String, Propiedad> mapPropiedad = new HashMap<String, Propiedad>();

    public void cargarCasa() {
        File leerArchivo = new File("casas.txt");

        try {
            FileReader leer = new FileReader(leerArchivo);
            BufferedReader almacenamiento = new BufferedReader(leer);
            String cadena = "";
            while (cadena != null) {
                try {
                    cadena = almacenamiento.readLine();
                    String dni = cadena;

                    cadena = almacenamiento.readLine();
                    String direccion = cadena;

                    cadena = almacenamiento.readLine();
                    String tasacionAr = "111111.0";

                    cadena = almacenamiento.readLine();
                    String cantAmbientesAr = "5";

                    cadena = almacenamiento.readLine();
                    String metrosCubiertosAr = "33.2";

                    cadena = almacenamiento.readLine();
                    String metrosTotalesAr = "2.0";

                    cadena = almacenamiento.readLine();
                    String antiguedadAr = "2";

                    int antiguedad = Integer.valueOf(antiguedadAr);
                    double tasacion = Double.valueOf(tasacionAr);
                    int cantAmbientes = Integer.valueOf(cantAmbientesAr);
                    double metrosCubiertos = Double.valueOf(metrosCubiertosAr);
                    double metrosTotales = Double.valueOf(metrosTotalesAr);

                    mapPropiedad.put(dni, new Casa(antiguedad, direccion, tasacion, cantAmbientes, metrosCubiertos, metrosTotales));
                } catch (IOException ex) {
                    
                }
            }
        } catch (IOException ex) {

        }

    }

    public void cargarDepartemento() {
        File leerArchivo = new File("departamentos.txt");

        try {
            FileReader leer = new FileReader(leerArchivo);
            BufferedReader almacenamiento = new BufferedReader(leer);
            String cadena = "";
            while (cadena != null) {
                cadena = almacenamiento.readLine();
                String dni = cadena;

                cadena = almacenamiento.readLine();
                String direccion = cadena;

                cadena = almacenamiento.readLine();
                double tasacion = Double.parseDouble(cadena);

                cadena = almacenamiento.readLine();
                int cantAmbientes = Integer.parseInt(cadena);

                cadena = almacenamiento.readLine();
                double metrosCubiertos = Double.parseDouble(cadena);

                cadena = almacenamiento.readLine();
                double metrosTotales = Double.parseDouble(cadena);

                cadena = almacenamiento.readLine();
                int antiguedad = Integer.parseInt(cadena);

                cadena = almacenamiento.readLine();
                int piso = Integer.parseInt(cadena);

                cadena = almacenamiento.readLine();
                int numero = Integer.parseInt(cadena);

                mapPropiedad.put(dni, new Departamento(direccion, tasacion, cantAmbientes, metrosCubiertos, metrosTotales, piso, numero));
            }
        } catch (IOException ex) {

        }
    }

    public int controlPropiedad(String dni) {

        if (!mapPropiedad.isEmpty()) {
            if (mapPropiedad.containsKey(dni)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }

//                almacenamiento.close();
//                leer.close();
    }
}
