package lab1tp5;

/**
 *
 * @author Leonel
 */
public class Producto {

    private String categoria;
    private String nombre;
    private double precio;

    public Producto(String categoria, String nombre, double precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "categoria=" + categoria + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

}
