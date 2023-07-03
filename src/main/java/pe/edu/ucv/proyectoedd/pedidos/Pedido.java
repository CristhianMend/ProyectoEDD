package pe.edu.ucv.proyectoedd.pedidos;

import java.util.UUID;
import pe.edu.ucv.proyectoedd.clientes.Cliente;
import pe.edu.ucv.proyectoedd.productos.Producto;

/**
 * @author Grupo 3
 */
public class Pedido {
    
    private UUID ID;
    private Cliente cliente;
    private Producto producto;
    private String ubicacion;
    private int cantidad;
    private boolean entregado;

    public Pedido(Cliente cliente, Producto producto, String ubicacion, int cantidad) {
        this.ID = UUID.randomUUID();
        this.cliente = cliente;
        this.producto = producto;
        this.ubicacion = ubicacion;
        this.cantidad = cantidad;
        this.entregado = false;
    }

    public Pedido(String id, Cliente cliente, Producto producto, String ubicacion, int cantidad, boolean entregado) {
        this.ID = UUID.fromString(id);
        this.cliente = cliente;
        this.producto = producto;
        this.ubicacion = ubicacion;
        this.cantidad = cantidad;
        this.entregado = entregado;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
}
