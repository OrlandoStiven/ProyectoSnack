public class Snack {
    protected static int contador;
    protected int id;
    protected String nombre;
    protected Double precio;

    public Snack(String nombre, Double  precio) {
        this.id = ++Snack.contador;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }
}
