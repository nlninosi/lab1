/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import becker.robots.*;
/**
 *
 * @author Nicolas
 */
public class Parqueadero {
    private Vehiculo[] vehiculos;
    private Seccion[] secciones;
    public int numVehiculos;
    public int nseccion;
    public Parqueadero(){
        this.vehiculos= new Vehiculo[14];
        this.secciones= new Seccion[3];
        this.numVehiculos=0;
        this.nseccion=0;
    }
    public boolean addSeccion (Seccion seccion){
        if(this.nseccion<3){
            this.secciones[this.nseccion]= seccion;
            this.nseccion++;
            seccion.numSecciones=this.nseccion;
            return true;
        }else{
            return false;
        }
    }
    public boolean addVehiculo(Vehiculo vehiculo){
        boolean o=false;
        int num=0;
        int n=5;
        for(int j=0; j<3; j++){
            
            if(n>this.secciones[j].numVehiculos){  
                n = this.secciones[j].numVehiculos;
                num=n;
                
            }
        }
        for(int j=0; j<3; j++){
            if(this.secciones[j].numVehiculos==n){
                    this.secciones[j].addVehiculo(vehiculo);
                    entrarVehiculo(this.secciones[j], vehiculo, this.secciones[j].numSecciones);
                    return true;
            }
        }
        return o;
    }
    public boolean sacarVehiculo (Vehiculo vehiculo,Seccion seccion){
            boolean y=seccion.sacarVehiculo(vehiculo);
           if(y=true){
              for(int i=seccion.numVehiculos;i>0;i--){
                  qwe(seccion,seccion.vehiculo[i],i);
              }
              vehiculo.robot.turnLeft();
              vehiculo.robot.turnLeft();
              for(int j=0;j<this.nseccion;j++){
                    vehiculo.robot.move();
              }
              vehiculo.robot.turnLeft();
              vehiculo.robot.turnLeft();
              seccion.vehiculo=seccion.nuevam(seccion.vehiculo,vehiculo);
              
              for(int i=seccion.numVehiculos;i>0;i--){
                temporal(seccion,seccion.vehiculo[i],i);
              }
              for(int i=seccion.numVehiculos;i>0;i--){
                temporal1(seccion,seccion.vehiculo[i],i);
              }
              
              return true; 
           } 
        return y;
    }
    public void qwe(Seccion seccion, Vehiculo vehiculo, int i){
        vehiculo.robot.turnLeft();
        vehiculo.robot.turnLeft();
        for(int j=0;j<6-i;j++){
                 vehiculo.robot.move();
                
        }
        vehiculo.robot.turnLeft();
      
        for(int j=1;j<3-seccion.numSecciones+i;j++){
            seccion.vehiculo[i].robot.move();
        }
        for(int j=0;j<3-this.nseccion;j++){
            seccion.vehiculo[i].robot.move();          
        }
    }
    public void temporal(Seccion seccion, Vehiculo vehiculo, int i){
        vehiculo.robot.turnLeft();
        for(int j=0;j<1;j++){
            seccion.vehiculo[i].robot.move();
        }
        vehiculo.robot.turnLeft();
    }
    public void temporal1(Seccion seccion, Vehiculo vehiculo, int i){
        vehiculo.robot.turnLeft();
        
        seccion.vehiculo[i].robot.move();
        vehiculo.robot.turnLeft();
        vehiculo.robot.turnLeft();
        vehiculo.robot.turnLeft();
        for(int j=0;j<3-seccion.numSecciones+i;j++){
            seccion.vehiculo[i].robot.move();
        }
        vehiculo.robot.turnLeft();
        vehiculo.robot.turnLeft();
        vehiculo.robot.turnLeft();
        for(int j=0;j<=5-i;j++){
            vehiculo.robot.move();
            
        }
        
    }
    public void entrarVehiculo(Seccion seccion, Vehiculo vehiculo, int i){
        for(int j=0;j<i;j++){
            vehiculo.robot.move();
        }
        vehiculo.robot.turnLeft();
        for(int j=0;j<=5-seccion.numVehiculos;j++){
            vehiculo.robot.move();
            
        }
    }
}

