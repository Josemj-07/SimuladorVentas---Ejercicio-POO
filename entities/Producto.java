package entities;

public class Producto {
    //Atributos de un producto de la empresa
    private String nombre;
    private String idProducto;
    private int stock;
    private double precio;

    public Producto(String nombre, String idProducto, int stock, double precio) {
        if(nombre == null || idProducto == null || stock < 0 || precio < 0) {
            throw new IllegalArgumentException("Parámetros no válidos");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.idProducto = idProducto;
    }

    //CONSTRUCTOR PARA FINES DE PRUEBAS DE FUNCIONAMIENTO
    public Producto() {
        this("Play Station 5", "00001", 2, 400);
    }

    //Getters
    public String getNombre() {return this.nombre;}
    public String getId() {return this.idProducto;}
    public int getStock() {return this.stock;}
    public double getPrecio() {return this.precio;}

    //métodos heredados de Object
    @Override
    public String toString() {
        return "Nombre del producto: " + this.nombre + "\n"
        + "Id del producto: " + this.idProducto + "\n"
        + "Precio: " + this.precio + "\n"
        + "Cantidad en stock: " + this.stock;

    }

    @Override
    public boolean equals(Object obj) {
        if((Object)this == obj) {
            return true;
        }
        if(obj != null && obj.getClass() == this.getClass()) {
            Producto tmp = (Producto) obj;
            if(this.idProducto.equals(tmp.idProducto)) {
                return true;
            }
        }
        return false;
    }

    /*
        La clase producto (y en general cualquier clase)
        debe ser responsable de su propio estado interno
        ninguna otra clase debe encargarse de modificar
        el valor de sus atributos, por ello hay que desarrollar
        métodos que permitan hacerlo de forma segura cuando se requirera

    */

    //Métodos del producto para controlar su stock
    public void reducirStock(int cantidadARestar) {
        if(this.stock - cantidadARestar < 0 || cantidadARestar < 0) {
            throw new IllegalArgumentException("Se ha ingresado un valor que no es válido");
        }
        this.stock -= cantidadARestar;
    }

    public void aumentarStock(int cantidadASumar) { //Este método como tal no tiene un uso práctico dentro del ejercicio, pero ahí está
        if(cantidadASumar < 0) {
            throw new IllegalArgumentException("Se ha ingresado un valor que no es válido");
        }
        this.stock += cantidadASumar;
    }

}
