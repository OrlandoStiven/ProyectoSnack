package archivos;
import java.io.*;


public class LeerArchivo {
    public static void main(String[] args) {
        var nombreArhivo = "save.txt";
        File archivo = new File(nombreArhivo);

        try{
            System.out.println("Contenido del archivo");
            //Abrir el archivo
            var entrada = new BufferedReader(new FileReader(archivo));
            //Liena del archivo
            var linea = entrada.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = entrada.readLine();
            }
        }catch (Exception e){
            System.out.println("Error, no se pudo leer el archivo" + e.getMessage());

        }
    }

}