package pe.edu.ucv.proyectoedd.productos;

import java.util.UUID;

/**
 * @author Grupo 3
 */
public class Producto {
    
    private UUID ID;
    private String nombre;
    private Categoria categoria;
    private double precio;
    private int stock;
    
    public Producto(String nombre, Categoria categoria, double precio, int stock) {
        this.ID = UUID.randomUUID();
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }
    
    public Producto(String id, String nombre, Categoria categoria, double precio, int stock) {
        this.ID = UUID.fromString(id);
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
}
