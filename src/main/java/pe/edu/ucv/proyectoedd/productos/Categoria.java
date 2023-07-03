package pe.edu.ucv.proyectoedd.productos;

import java.util.UUID;

/**
 * @author Grupo 3
 */
public class Categoria {
    
    private UUID ID;
    private String nombre;
    private int productos;
    
    public Categoria(String nombre) {
        this.ID = UUID.randomUUID();
        this.nombre = nombre;
        this.productos = 0;
    }
    
    public Categoria(String id, String nombre, int productos) {
        this.ID = UUID.fromString(id);
        this.nombre = nombre;
        this.productos = productos;
    }
    
    @Override
    public String toString() {
        return nombre;
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

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }
}
