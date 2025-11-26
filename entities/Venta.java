package entities;
import java.util.Date;

public class Venta {
    private Date fechaVenta;
    private Cliente cliente;
    private Producto producto;
    private int cantidadAComprar;

    public Venta(Cliente cliente, Producto producto, int cantidadAComprar) {
        if(cliente == null || producto == null|| cantidadAComprar <= 0) {
            throw new IllegalArgumentException("Error al realizar la venta, clientes o productos no válidos");
        }
        this.cliente = cliente;
        this.producto = producto;
        this.cantidadAComprar = cantidadAComprar;
        fechaVenta = new Date();
    }

    //Getters
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public Producto getProducto() {
        return this.producto;
    }

    public String obtenerDetallesDeLaVenta() {
        return cliente.toString() + "\n" + "\n" + "Nombre del producto: "+ producto.getNombre() + 
        "\n" + "Cantidad a comprar: " + cantidadAComprar
        + "\n" + "Fecha de la venta: " + fechaVenta.toString();
    }

    public void vender() throws Exception {
        if(this.cantidadAComprar > producto.getStock() || cliente.getSaldo() < producto.getPrecio()*cantidadAComprar) {
            throw new Exception("No se puede realizar la venta");
        }
        cliente.recibirProductos(this.producto, cantidadAComprar);
        producto.reducirStock(cantidadAComprar);
    }


}