package formularioPersonas;
import java.util.*;
import java.io.*;

public class Personas {
    static String nombreArchivo = "formulario.txt";
    static File archivo = new File(nombreArchivo);

    //Funcion que me ayuda a crear el archivo.
    public static void CrearArchivo(){
        try{
            if(archivo.exists()){
                System.out.println("el archivo ya existe");
            }else{
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
            }
        }catch (IOException e){
            System.out.println("Error al crear el archivo" + e.getMessage());
        }
    }

    //Escribir el archivo
    public static void EscribirArchivo(String texto){
        boolean anexar = false;

        try{
            anexar = archivo.exists();
            var salida = new PrintWriter (new FileWriter(archivo, anexar));
            salida.println(texto);
            salida.close();
            System.out.println("Se guardo correctamente la inforación");
        }catch (Exception e){
            System.out.println("Error al guardar la información" + e.getMessage());
        }

    }

    //Leer archivo
    public static void leerArchivo(){
        try{
            var entrada = new BufferedReader(new FileReader(archivo));
            var linea = entrada.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = entrada.readLine();
            }
            entrada.close();
        }catch (Exception e){
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
    public static void formulario(){
        var console = new Scanner(System.in);
        System.out.println("Formulario de datos");

        System.out.println("Nombre");
        var nombre = console.nextLine();
        System.out.println("Edad:");
        int edad = Integer.parseInt(console.nextLine());
        System.out.println("Sexo:" );
        String sexo = console.nextLine();

        EscribirArchivo(" nombre: " + nombre + " edad: " +  edad + " Sexo: " + sexo);
    }

    public static void main(String[] args) {
        var console = new Scanner(System.in);
        CrearArchivo();

        var salida = false;
        while(!salida){
            System.out.println("Sistema de almacenamiento de datos");
            System.out.println("""
            Menu de opciones:
            1. Ingresar datos
            2. Consultar datos
            3. Salir
                    """
            );
            int opcion = Integer.parseInt(console.nextLine());
            switch (opcion){
                case 1:{
                    formulario();
                    break;
                } case 2: {
                    leerArchivo();
                    break;
                } case 3:{
                    System.out.println("Salir del sistema");
                    salida = true;
                    break;
                }
            }

        }
    }


}
