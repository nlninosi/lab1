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
public class Tiempo {
    public int año;
    public int mes;
    public int dia;
    public int hora;
    public Tiempo(int año, int mes, int dia, int horas){
        this.año=año;
        this.mes=mes;
        this.dia=dia;
        this.hora=hora;
    }
    public int getaño(){
        return año;
    }
    public int setaño(int i){
        return this.año =i;
    }
    public int getmes(){
        return mes;
    }
    public int setmes(int i){
        return this.mes =i;
    } 
    public int getdia(){
        return dia;
    }
    public int setdia(int i){
        return this.dia =i;
    } 
    public int gethora(){
        return hora;
    }
    public int sethora(int i){
        return this.hora =i;
    } 
    @Override
    public String toString(){
        return "{Año:"+año+" ,Mes:"+mes+" ,Dia:"+dia+" ,Hora"+hora+"}";
        
    }
}




