import java.util.ArrayList;

public class Snacks {
    protected static ArrayList<Object> listaSnacks = new ArrayList<>();
    static {

        listaSnacks.add(new Snack("Papas", 70.0));
        listaSnacks.add(new Snack("Refresco", 50.0));
        listaSnacks.add(new Snack("Sandwich", 120.0));
    }

    public static  void agregarSnak(Object snak){
        listaSnacks.add(snak);
        System.out.println(listaSnacks.get(0).toString());
    }

    public static void mostrarSnak(){
        for(Object snak:listaSnacks){
           snak.toString();
            System.out.println("\n");
        }
    }

    public static ArrayList<Object> getSnaks(){
        return listaSnacks;
    }

}
