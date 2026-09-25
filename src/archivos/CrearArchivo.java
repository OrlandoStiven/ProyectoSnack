package archivos;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombre = "save.txt";
        var archivo = new File(nombre);

        try {
            if (archivo.exists()) {
                System.out.println("El archivo ya existe");
            } else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se creo el archivo de forma correcta");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

