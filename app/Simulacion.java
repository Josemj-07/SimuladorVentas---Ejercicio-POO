package app;
import entities.Cliente;
import entities.Producto;
import entities.Venta;
import java.util.Scanner;

public class Simulacion {

    public static void main(String args[]) {
        try {

            Cliente cliente = new Cliente();
            Producto producto = new Producto();
            Scanner scanner = new Scanner(System.in);
            String cantidadAComprar ="";


            do {
                System.out.println("Hola " + cliente.getNombre() + " ¿Cuantos " + producto.getNombre() + " quieres comprar hoy?");
                cantidadAComprar = scanner.nextLine();
            } while (cantidadAComprar.isEmpty());

            scanner.close();

            System.out.println("ESTE ES EL ESTADO DEL CLIENTE ANTES DE HACER LA COMPRA");
            System.out.println("\n" + cliente.toString());
            System.out.println();
            System.out.println("\n" + "ESTE ES EL ESTADO DEL PRODUCTO ANTES DE HACER LA COMPRA");
            System.out.println("\n" + producto.toString());

            Venta venta = new Venta(cliente, producto, Integer.parseInt(cantidadAComprar));
            venta.vender();
            System.out.println();
            System.out.println();
            System.out.println("\n" + "VENTA REALIZADA" + "\n");
            System.out.println(venta.obtenerDetallesDeLaVenta());

            System.out.println();
            System.out.println();
            System.out.println("CONTENIDO DE LA LISTA DE PRODUCTOS DEL CLIENTE");

            //CONTENIDO DE LA LISTA DE PRODUCTOS DEL CLIENTE
            for (Producto prod: cliente.getProductosComprados()) {
                System.out.print(prod.getNombre() + "\t");
            }

            System.out.println();
            System.out.println();
            System.out.println("STOCK DEL PRODUCTO DESPUES DE LA COMPRA");
            System.out.println("Stock: "+producto.getStock());

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}