package pe.edu.ucv.proyectoedd.clientes;

import java.util.UUID;

/**
 * @author Grupo 3
 */
public class Cliente {
    
    private UUID ID;
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Cliente(String nombre, String apellidos, int edad) {
        this.ID = UUID.randomUUID();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public Cliente(String id, String nombre, String apellidos, int edad) {
        this.ID = UUID.fromString(id);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
