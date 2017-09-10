/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.*;
/**
 *
 * @author Nicolas
 */
public class Car {
    public int traveled;
    public CarModel carmodel;
    public Car(int traveled, CarModel carmodel){
        this.carmodel=carmodel;
        this.traveled=traveled;
    }
    public CarModel getCarModel(){
        return carmodel;
    }
    public int getName() {
        return traveled;
    }

    public void setName(int traveled) {
        this.traveled = traveled;
    }
     @Override
    public String toString(){
        return "Carro {Modelo del Carro:"+carmodel+" Kilometraje:"+traveled+"}";
        
    }
}
