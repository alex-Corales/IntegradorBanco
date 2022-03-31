package controlador;

import modelo.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LecturaArchivoUsuario {

    HashMap<String, Usuario> mapUsuario = new HashMap<String, Usuario>();

    public void cargarUsuario() {

        File leerArchivo = new File("usuarios.txt");

        try {
            FileReader leer = new FileReader(leerArchivo);
            BufferedReader almacenamiento = new BufferedReader(leer);
            String cadena = "";
            while (cadena != null) {
                try {
                    cadena = almacenamiento.readLine();
                    String nombre = cadena;
                    cadena = almacenamiento.readLine();
                    String contraseña = cadena;

                    mapUsuario.put(nombre, new Usuario(contraseña));
                } catch (IOException ex) {

                }

            }
            almacenamiento.close();
            leer.close();
        } catch (IOException ex) {

        }

    }

    public int controlUsuario(String usuario, String contraseña) {

        if (!mapUsuario.isEmpty()) {
            if (mapUsuario.containsKey(usuario)) {
                Usuario cont = mapUsuario.get(usuario);
                if (contraseña.equals(cont.getContraseña())) {
                    return 1;
                }

            } else {
                return 0;
            }
        } else {
            return 0;
        }
        return 0;
    }

}
