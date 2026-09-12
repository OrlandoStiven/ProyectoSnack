import java.util.ArrayList;

public class Snacks {
    protected static ArrayList<Snack> listaSnacks = new ArrayList<>();
    static {

        listaSnacks.add(new Snack("Papas", 70.0));
        listaSnacks.add(new Snack("Refresco", 50.0));
        listaSnacks.add(new Snack("Sandwich", 120.0));
    }

    public static  void agregarSnak(Snack snack) {
        listaSnacks.add(snack);
    }

    public static Snack comprarSnack(String nombre){
        for(Snack snack : listaSnacks){
            if (nombre.equals(snack.getNombre())){
                return snack;
            }
        }
        return null;
    }


    public static void mostrarSnak(){
        for(Object snak:listaSnacks){
            System.out.println(snak.toString());
        }
        System.out.println();
    }


}
