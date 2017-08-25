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
public class Formapago {
    public boolean efectivo;
    public boolean debito;
    public boolean tarjeta;
    public Formapago( boolean efectivo, boolean debito, boolean tarjeta){
        this.efectivo=efectivo;
        this.debito=debito;
        this.tarjeta=tarjeta;
    }
    public boolean getefectivo(){
        return efectivo;
    }
    public boolean setefectivo(boolean i){
        return this.efectivo =i;
    }
    public boolean getdebito(){
        return debito;
    }
    public boolean setdebito(boolean i){
        return this.debito =i;
    }
    public boolean gettarjeta(){
        return tarjeta;
    }
    public boolean settarjeta(boolean i){
        return this.tarjeta=i;
    }
   @Override
    public String toString(){
        return "{Debito:"+debito+" efectivo:"+efectivo+" tarjeta:"+tarjeta+"}";
        
    }
   
}
