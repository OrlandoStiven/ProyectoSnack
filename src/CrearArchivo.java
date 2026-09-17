import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {

    public static void main(String[] args) {
        //Nombre del archivo
        var nombreArchivo = "mi_archivo.txt";
        try{
            var archivo = new File(nombreArchivo);
            if(archivo.exists()){
                System.out.println("El archivo ya existe");
            }else{
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se a creado el archivo");
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
