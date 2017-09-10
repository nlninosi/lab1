/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Nicolas
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto p1= new Producto(3,3,3);
        Producto p2= new Producto(3,3,3);
        Proveedores v1=new Proveedores("a");
        Inventario i1= new Inventario();
        i1.addProducto(p1);
        i1.addProducto(p2);
        i1.listarProductos();
        i1.registrarPedido(v1, 0, p2);
    }
    
}
