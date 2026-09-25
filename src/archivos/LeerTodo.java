package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "save.txt";

        try{
            //leer todas las lineas del archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo todo ");
            for(String linea : lineas){
                System.out.println(linea);
            }

        }catch (Exception e){
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }
}
