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
public class Vendedor {
    public int id;
    public String nombre;
    public Ventas venta;
    public Vendedor( int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
     public int getid(){
        return id;
    }
    public String getnombre(){
        return nombre;
    }
    public double setid(int i){
        return this.id =i;
    } 
    public String setnombre(String i){
        return this.nombre =i;
    }
    public void ventasrealizadas(Producto producto, Venta venta){
        if(producto==venta.producto){
            System.out.println(venta);
        }else{
            System.out.println("El vendedor no ha realizado la venta de ese producto");
        }
    }
    @Override
    public String toString(){
        return "{ID:"+id+" ,Nombre:"+nombre+"}";
        
    }
}
