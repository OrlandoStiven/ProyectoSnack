package archivos;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.*;

public class EscribirArchivo {
    public static void main(String[] args) {
        Boolean anexar = false;
        var nombreArchivo = "save.txt";
        var archivo = new File(nombreArchivo);
        try{
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            var nuevoContenido = "\nNuevo\n Contenido";
            salida.println(nuevoContenido);
            salida.close();

        }catch (Exception e){
            System.out.println("Error al agregar al archivo " +  e.getMessage());

        }
    }

}
