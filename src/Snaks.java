import java.util.ArrayList;

public class Snaks {
    protected ArrayList<Object> listaSnacks = new ArrayList<>();

    public void agregarSnak(Object snak){
        listaSnacks.add(snak);
    }

    public void mostrarSnak(){
        for(Object snak:listaSnacks){
           snak.toString();
            System.out.println("\n");
        }
    }

    public ArrayList<Object> getSnaks(){
        return listaSnacks;
    }

}
