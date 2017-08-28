/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

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
        Scanner flujo = new Scanner(System.in);
        System.out.println("Creacion de Producto");
        int i = flujo.nextInt();
 
        System.out.println("Creacion de Producto");
        System.out.println("Codigo Producto");
        int codigo = flujo.nextInt();
        System.out.println("Descripcion Producto");
        String descripcion= flujo.next();
        System.out.println("Precio unitario Producto");
        double preciouni = flujo.nextDouble();
        Producto producto = new Producto(codigo,descripcion,preciouni);
        
        Formapago f1 = new Formapago(true,false,false);
        Tiempo t1 = new Tiempo(2017,4,30,12);
        Vendedor v1 = new Vendedor(101,"jorge","martinez");
        Ventas ve1 =new Ventas(3,0,0,t1,v1,f1,producto);
        Ventas ve2 =new Ventas(3,0,0,t1,v1,f1,producto);
        System.out.println(ve1);
        
        v1.ventasrealizadas(producto, ve1);
        
        
    }
    
}
