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
public class Producto {
    public int codigo;
    public String descripcion;
    public double preciouni;
    
    public Producto(int codigo ,String descripcion, double preciouni ){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.preciouni=preciouni;
    }
    public int getcodigo(){
        return codigo;
    }
    public String getdescripcion(){
        return descripcion;
    }
    public double getprecionuni(){
        return preciouni;
    }
    public int setcodigo(int i){
        return this.codigo =i;
    } 
    public double setpreciouni( double i){
        return this.preciouni =i;
    } 
    public String setdescpricion(String i){
        return this.descripcion =i;
    }
    @Override
    public String toString(){
        return "Producto {codigo:"+codigo+" descripcion:"+descripcion+" precio unitario:"+preciouni+"}";
        
    }
}
