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
public class Ventas {
    public int cantvendida;
    public double total;
    public double descuentos;
    public Tiempo tiempo;
    public Vendedor vendedor;
    public Formapago formapago;
    public Producto producto;
    public static Integer numObjetos;
    public int Realizadas(){
     return numObjetos = numObjetos==null? 1: (numObjetos+1);
    }
    public Ventas(int cant,double total, double descuentos, Tiempo tiempo, Vendedor vendedor, Formapago formapago, Producto producto){
        this.cantvendida=cant;
        this.total=total;
        this.descuentos=descuentos;
        this.tiempo=tiempo;
        this.vendedor=vendedor;
        this.formapago=formapago;
        this.producto=producto;
    }
    public Tiempo gettiempo(){
        return tiempo;
    }
    public void settiempo(Tiempo tiempo) {
        this.tiempo = tiempo;
    }
    public Vendedor getvendedor(){
        return vendedor;
    }
    public void setvendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }public Formapago getformapago(){
        return formapago;
    }
    public void setformapago(Formapago formapago) {
        this.formapago = formapago;
    }
     public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
     public int getcantvendida(){
        return cantvendida;
    }
     public int setcantvendida(int i){
        return this.cantvendida =i;
    }
      public double gettotal(){
        return total;
    }
    public double settotal(double i){
        return this.total =i;
    }
     public double getdescuentos(){
        return descuentos;
    }
    public double setdescuentos(double i){
        return this.descuentos =i;
    }
     public void factura(Tiempo tiempo, Producto producto, Vendedor vendedor, Formapago formapago,int cantvendida,double total, double descuentos){
        total=producto.preciouni*cantvendida;
        System.out.println("Factura {Codigo producto:"+producto.codigo+" ,Tiempo:"+tiempo+" ,Vendedor:"+vendedor+" ,Forma de pago"+formapago+" ,Cantidad vendida"+cantvendida+" ,Descuentos"+descuentos+" ,Total"+total+"}");
    }
    @Override
    public String toString(){
        total=producto.preciouni*cantvendida;
        return "Venta {Producto:"+producto+" ,Tiempo:"+tiempo+" ,Vendedor:"+vendedor+" ,Forma de pago"+formapago+" ,Cantidad vendida"+cantvendida+" ,Descuentos"+descuentos+" ,Total"+total+"}";
        
    }
}

