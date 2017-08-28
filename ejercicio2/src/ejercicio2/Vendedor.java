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
     public String apellido;
    public Ventas venta;
    public int realizadas=0;
   
    

    public Vendedor( int id, String nombre,String apellido){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
    }
     public int getid(){
        return id;
    }
    public String getnombre(){
        return nombre;
    }
     public String getapellido(){
        return apellido;
    }
    public double setid(int i){
        return this.id =i;
    } 
    public String setnombre(String i){
        return this.nombre =i;
    }
    public String setapellido(String i){
        return this.apellido =i;
    }
    public void ventasrealizadas(Producto producto, Ventas venta){
        if(producto==venta.producto){
            System.out.println("El vendedor ya realizo la venta de este preducto:");
            System.out.println(venta);
        }else{
            System.out.println("El vendedor no ha realizado la venta de ese producto");
        }
    }
    @Override
    public String toString(){
        return "{ID:"+id+" ,Nombre:"+nombre+" "+apellido+"}";
        
    }
}
