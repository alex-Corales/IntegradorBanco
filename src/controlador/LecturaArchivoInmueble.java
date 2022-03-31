package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;
import modelo.Casa;
import modelo.Departamento;
import modelo.Propiedad;

public class LecturaArchivoInmueble {

    private static HashMap<String, Propiedad> mapPropiedad = new HashMap<String, Propiedad>();

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
                    String tasacionAr = cadena;

                    cadena = almacenamiento.readLine();
                    String cantAmbientesAr = cadena;

                    cadena = almacenamiento.readLine();
                    String metrosCubiertosAr = cadena;

                    cadena = almacenamiento.readLine();
                    String metrosTotalesAr = cadena;

                    cadena = almacenamiento.readLine();
                    String antiguedadAr = cadena;

                    mapPropiedad.put(dni, new Casa(antiguedadAr, direccion, tasacionAr, cantAmbientesAr, metrosCubiertosAr, metrosTotalesAr));

                } catch (IOException ex) {

                }
            }

            almacenamiento.close();
            leer.close();
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
                String tasacion = cadena;

                cadena = almacenamiento.readLine();
                String cantAmbientes = cadena;

                cadena = almacenamiento.readLine();
                String metrosCuadradosTotales = cadena;

                cadena = almacenamiento.readLine();
                String metrosCuadradosCubiertos = cadena;

                cadena = almacenamiento.readLine();
                String piso = cadena;

                cadena = almacenamiento.readLine();
                String numero = cadena;

                mapPropiedad.put(dni, new Departamento(direccion, tasacion, cantAmbientes, metrosCuadradosCubiertos, metrosCuadradosTotales, piso, numero));

            }
            almacenamiento.close();
            leer.close();
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
    }
    
    public HashMap<String, Propiedad> propiedadCargadaMapa(){
        cargarCasa();
        cargarDepartemento();
        return mapPropiedad;
    }
    
    public HashMap<String, Propiedad> propiedadCargadaMapaCasa(){
        cargarCasa();
        return mapPropiedad;
    }
    
    public static HashMap<String, Propiedad> accesoADatos() {
        return mapPropiedad;
    }
    
        public static void eliminarCasa(){
        File archivo= new File("casas.txt");
        Set<String>c= mapPropiedad.keySet();
        for(String clave: c){
            System.out.println(clave);
            if(mapPropiedad.get(clave) instanceof Casa){
                if (!archivo.exists()) {
                    try {
                        archivo.createNewFile(); //Si no existe lo crea
                        FileWriter escribir = new FileWriter(archivo, false);
                        PrintWriter linea = new PrintWriter(escribir);
                        linea.print(clave +"\r\n");
                        linea.print(mapPropiedad.get(clave).getDireccion() +"\r\n");
                        linea.print(  mapPropiedad.get(clave).getValorTasacion() +"\r\n");
                        linea.print(mapPropiedad.get(clave).getCantAmbientes() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosCubiertos() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosTotales()+"\r\n");
                        linea.print( ((Casa)(mapPropiedad.get(clave))).getAntiguedad()+"\r\n");
                        linea.close();
                        escribir.close();
                    } catch (IOException ex) {
                        System.err.println("Error");
                    }       
                }else{
                    try {
                        FileWriter escribir = new FileWriter(archivo, false);
                        PrintWriter linea = new PrintWriter(escribir);
                       linea.print(clave +"\r\n");
                        linea.print(mapPropiedad.get(clave).getDireccion() +"\r\n");
                        linea.print(  mapPropiedad.get(clave).getValorTasacion() +"\r\n");
                        linea.print(mapPropiedad.get(clave).getCantAmbientes() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosCubiertos() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosTotales()+"\r\n");
                        linea.print( ((Casa)(mapPropiedad.get(clave))).getAntiguedad()+"\r\n");
                        linea.close();
                        escribir.close();
                    } catch (IOException ex) {
                        System.err.println("Error");
                    }   
            
                }
            }
        }
    }
    
    public static void eliminarDepartamento(){
        File archivo= new File("departamentos.txt");
        Set<String>c= mapPropiedad.keySet();
        for(String clave: c){
            if (!archivo.exists()) {
                 try {
                        archivo.createNewFile(); //Si no existe lo crea
                        FileWriter escribir = new FileWriter(archivo, false);
                        PrintWriter linea = new PrintWriter(escribir);
                        linea.print(clave +"\r\n");
                        linea.print(mapPropiedad.get(clave).getDireccion() +"\r\n");
                        linea.print(  mapPropiedad.get(clave).getValorTasacion() +"\r\n");
                        linea.print(mapPropiedad.get(clave).getCantAmbientes() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosCubiertos() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosTotales()+"\r\n");
                        linea.print(((Departamento)(mapPropiedad.get(clave))).getPiso() +"\r\n");
                        linea.print(((Departamento)(mapPropiedad.get(clave))).getNumero() +"\r\n");
                        linea.print(((Departamento)(mapPropiedad.get(clave))).getLetra()+"\r\n");
                        linea.close();
                        escribir.close();
                    } catch (IOException ex) {
                        System.err.println("Error");
                    }       
            }else{
                try {
                        FileWriter escribir = new FileWriter(archivo, false);
                        PrintWriter linea = new PrintWriter(escribir);
                        linea.print(clave +"\r\n");
                        linea.print(mapPropiedad.get(clave).getDireccion() +"\r\n");
                        linea.print(  mapPropiedad.get(clave).getValorTasacion() +"\r\n");
                        linea.print(mapPropiedad.get(clave).getCantAmbientes() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosCubiertos() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosTotales()+"\r\n");
                        linea.print(((Departamento)(mapPropiedad.get(clave))).getPiso() +"\r\n");
                        linea.print(((Departamento)(mapPropiedad.get(clave))).getNumero() +"\r\n");
                        linea.print(((Departamento)(mapPropiedad.get(clave))).getLetra()+"\r\n");
                        linea.close();
                        escribir.close();
                } catch (IOException ex) {
                    System.err.println("Error");
                }   
            }
        }
    }
    
    public static void modificarCasa(){
        File archivo= new File("casas.txt");
        Set<String>c= mapPropiedad.keySet();
        for(String clave: c){
            if(mapPropiedad.get(clave) instanceof Casa){
                if (!archivo.exists()) {
                    try {
                        archivo.createNewFile(); //Si no existe lo crea
                        FileWriter escribir = new FileWriter(archivo, false);
                        PrintWriter linea = new PrintWriter(escribir);
                        linea.print(clave +"\r\n");
                        linea.print(mapPropiedad.get(clave).getDireccion() +"\r\n");
                        linea.print(  mapPropiedad.get(clave).getValorTasacion() +"\r\n");
                        linea.print(mapPropiedad.get(clave).getCantAmbientes() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosCubiertos() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosTotales()+"\r\n");
                        linea.print( ((Casa)(mapPropiedad.get(clave))).getAntiguedad()+"\r\n");
                        linea.close();
                        escribir.close();
                    } catch (IOException ex) {
                        System.err.println("Error");
                    }       
                }else{
                    try {
                        FileWriter escribir = new FileWriter(archivo, false);
                        PrintWriter linea = new PrintWriter(escribir);
                        linea.print(clave +"\r\n");
                        linea.print(mapPropiedad.get(clave).getDireccion() +"\r\n");
                        linea.print(  mapPropiedad.get(clave).getValorTasacion() +"\r\n");
                        linea.print(mapPropiedad.get(clave).getCantAmbientes() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosCubiertos() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosTotales()+"\r\n");
                        linea.print( ((Casa)(mapPropiedad.get(clave))).getAntiguedad()+"\r\n");
                        linea.close();
                        escribir.close();
                    } catch (IOException ex) {
                        System.err.println("Error");
                    }   
            
                }
            }
        }
    }
    
    public static void modificarDepto(){
       File archivo= new File("departamentos.txt");
        Set<String>c= mapPropiedad.keySet();
        for(String clave: c){
            if (!archivo.exists()) {
                try {
                        archivo.createNewFile(); //Si no existe lo crea
                        FileWriter escribir = new FileWriter(archivo, false);
                        PrintWriter linea = new PrintWriter(escribir);
                        linea.print(clave +"\r\n");
                        linea.print(mapPropiedad.get(clave).getDireccion() +"\r\n");
                        linea.print(  mapPropiedad.get(clave).getValorTasacion() +"\r\n");
                        linea.print(mapPropiedad.get(clave).getCantAmbientes() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosCubiertos() +"\r\n");
                        linea.print( mapPropiedad.get(clave).getMetrosCuadradosTotales()+"\r\n");
                        linea.print(((Departamento)(mapPropiedad.get(clave))).getPiso() +"\r\n");
                        linea.print(((Departamento)(mapPropiedad.get(clave))).getNumero() +"\r\n");
                        //linea.print(((Departamento)(mapPropiedad.get(clave))).getLetra()+"\r\n");
                        linea.close();
                        escribir.close();
                    } catch (IOException ex) {
                        System.err.println("Error");
                    }       
            }else{
                    try {
                            FileWriter escribir = new FileWriter(archivo, false);
                            PrintWriter linea = new PrintWriter(escribir);
                            linea.print(clave +"\r\n");
                            linea.print(mapPropiedad.get(clave).getDireccion() +"\r\n");
                            linea.print(  mapPropiedad.get(clave).getValorTasacion() +"\r\n");
                            linea.print(mapPropiedad.get(clave).getCantAmbientes() +"\r\n");
                            linea.print( mapPropiedad.get(clave).getMetrosCuadradosCubiertos() +"\r\n");
                            linea.print( mapPropiedad.get(clave).getMetrosCuadradosTotales()+"\r\n");
                            linea.print(((Departamento)(mapPropiedad.get(clave))).getPiso() +"\r\n");
                            linea.print(((Departamento)(mapPropiedad.get(clave))).getNumero() +"\r\n");
                           // linea.print(((Departamento)(mapPropiedad.get(clave))).getLetra()+"\r\n");
                            linea.close();
                            escribir.close();
                        } catch (IOException ex) {
                             System.err.println("Error");
                        }   
                    }
                 }    
        }   
    
}
