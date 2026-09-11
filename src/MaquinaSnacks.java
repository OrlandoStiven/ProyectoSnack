import java.util.*;

public class MaquinaSnacks {

    public static int mostrarMenu(Scanner scanner){
        System.out.println("""
        Bienvenido al sistema Maquina de snack
        1. Comprar Snack
        2. Mostrar Tickect
        3. Agregar Sanck
        4. Salir
        opcion:""");
        return  Integer.parseInt(scanner.nextLine());


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> productos = new ArrayList<>();
        System.out.println("Inventario\n---------------------------------");
        Snacks.mostrarSnak();

        //Condicoines
        Boolean salir = !false;
        while(salir){
            try{
                int opcion = mostrarMenu(scanner);

            }catch (Exception e){
                System.out.println("Occurio un error" + e.getMessage());
            }
            finally {
                System.out.println();
            }
        }


    }
}
