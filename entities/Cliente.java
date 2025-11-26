package entities;
import java.util.ArrayList;

public class Cliente {

    private ArrayList<Producto> productosComprados;
    private String nombre;
    private String dni;
    private double saldo;


    public Cliente(String nombre, String dni, double saldo) {
        if(nombre == null || dni == null || saldo < 0) {
            throw new IllegalArgumentException("Parámetros no válidos");
        }
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
        productosComprados = new ArrayList<>();
    }

    //CONSTRUCTOR PARA FINES DE PRUEBAS DE FUNCIONAMIENTO
    public Cliente() {
        this("Jose Muñoz", "23974239", 5000);
    }

    //Getters y setters
    public String getNombre() {return this.nombre;}
    public String getDni() {return this.dni;}
    public ArrayList<Producto> getProductosComprados() {return this.productosComprados;}
    public double getSaldo() {return this.saldo;}


    /*
        De igual manera que para el producto (y para todas las clases en general)
        solo el cliente debe preocuparse por su estado interno, y nadie más que no sea
        el mismo puede modificarlo, no tendría sentido que por ejemplo el producto pudisese
        descontar el saldo de cliente, o que un cliente pueda descontar o aumentar el stock de un producto,
        por lo tanto se deben proveer herramientas seguras para que existan estos métodos, pero que cada clase 
        se encargue de hacerlo de forma encapsulada, cada una en lo suyo
    
    */

    private void descontarDelSaldo(double monto) {
        if(this.saldo - monto < 0 || monto < 0) {
            throw new IllegalArgumentException("No se puede pagar el producto");
        }
        this.saldo -= monto;
    }

    public void recibirProductos(Producto productoComprado, int cantidadProductos) {
        if(productoComprado == null) {
            throw new IllegalArgumentException("Se ha recibido un producto no valido");
        }

        descontarDelSaldo(productoComprado.getPrecio()*cantidadProductos);

        for(int i = 0; i < cantidadProductos; i ++) { // añade a la lista de productos comprado el producto que se compró n veces
            productosComprados.add(productoComprado);
        }
        
    }

    //Metodos heredados de Object
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n"
        + "Dni: " + this.dni + "\n"
        + "Saldo: " + this.saldo + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {return true;}
        if(obj != null && this.getClass() == obj.getClass()) {
            Cliente tmp = (Cliente) obj;
            if(this.dni.equals(tmp.dni)) {
                return true;
            }
        }
        return false;
    }


    

}