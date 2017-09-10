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
public class Seccion {
    public Vehiculo[] vehiculo;
    private boolean[] ocupado;
    
    public int numVehiculos;
    public int numSecciones;
    public Seccion(){
        this.vehiculo= new Vehiculo[5];
        this.ocupado= new boolean[5];
        this.numSecciones=0;
        this.numVehiculos=0;
    }
    public boolean addVehiculo(Vehiculo vehiculo){
        for(int i=1;i<=5;i++){
            if(this.ocupado[i]==false){
                this.ocupado[i]=true;
                this.vehiculo[i]=vehiculo;
                this.numVehiculos++;
                return true;
            }
        }
        return false;
    }
    public boolean sacarVehiculo(Vehiculo vehiculo){
        for(int i=1;i<=5;i++){
            if(this.vehiculo[i].equals(vehiculo)){               
                return true;          
            }
        }
        return false;
    }
    public Vehiculo[] nuevam(Vehiculo[] vehiculos,Vehiculo vehiculo){
        Vehiculo[] h= new Vehiculo[5];
        int m=this.numVehiculos;
        for(int i=this.numVehiculos;i>0;i--){
            this.ocupado[i]=false;
            if(vehiculos[i].equals(vehiculo)){
                vehiculos[i]=null;
                this.numVehiculos--;
                
            }else{
                m--;
                h[m]=vehiculos[i];
                
            }
        }
        for(int i=0;i<=this.numVehiculos;i++){
            addVehiculo(h[i]);
            
            this.numVehiculos--;
        }
        for(int i=1;i<=2;i++){
            System.out.println(h[i].placa);
        }
        return h;
    }
    
        public int getNum() {
        return this.numVehiculos;
    }

    public void setNum(int placa) {
        this.numVehiculos = placa;
    }
    
}
