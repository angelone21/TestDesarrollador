package edu.cecar.controladores;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * Clase: ControladorImagen
 *
 * @version: 0.1
 *
 * @since: 18/09/2019
 *
 * Fecha de Modificación:
 *
 * @author: Vincenzo Angelone
 *
 * Copyrigth: CECAR
 */
public class ControladorImagen {

    public String descargarImagen(String url, String i) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        URL url1 = new URL(url);
        inputStream = url1.openStream();
        String path = System.getProperty("user.dir");
        outputStream = new FileOutputStream(path +"\\"+ "imagen" + i + ".jpg");
        String nombre = "imagen" + i + ".jpg";

        byte[] buffer = new byte[2048];
        int tamaño;
        while ((tamaño = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, tamaño);
        }

        inputStream.close();
        outputStream.close();

        return nombre;

    }

}
