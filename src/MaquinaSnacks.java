import java.sql.SQLOutput;
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

    public static void agregegarSnackMaquina(Scanner scanner){
        System.out.println("Agregar Snack");
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Precio:");
        Double precio = Double.parseDouble(scanner.nextLine());
        Snack snack = new Snack(nombre, precio);
        Snacks.agregarSnak(snack);

    }

    public static void comprarSnack(Scanner scanner,  ArrayList productos){
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        var productoSnack = Snacks.comprarSnack(nombre);
        if(productoSnack.equals(null)){
            System.out.println("El producto no se encuentra disponible");
        }else{
            System.out.println(productoSnack.toString() + "Agregado con exito");
            productos.add(productoSnack);
        }
    }

    public static void mostrarTickets(ArrayList productos){
        System.out.println("Resumen de venta");
        Double totalVenta;
        for(Object producto : productos){
            System.out.println(producto.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<Snack> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inventario\n---------------------------------");
        Snacks.mostrarSnak();

        //Condicoines
        Boolean salir = !false;
        while(salir){
            try{
                int opcion = mostrarMenu(scanner);
                switch (opcion){
                    case 1: {comprarSnack(scanner, productos);
                        break;
                    }
                    case 2: {
                        mostrarTickets(productos);
                        break;
                    }
                    case 3: {
                        agregegarSnackMaquina(scanner);
                        break;
                    }
                    case 4: {
                        salir = false;
                        break;
                    }

                }

            }catch (Exception e){
                System.out.println("Occurio un error" + e.getMessage());
            }
            finally {
                System.out.println();
            }
        }


    }
}
