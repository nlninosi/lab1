/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.*;
import becker.robots.*;
/**
 *
 * @author Nicolas
 */
public class Vehiculo {
    public int placa;
    private int tiempo;
    public Robot robot;
    public Vehiculo(int placa, int tiempo, Robot robot){
        this.placa=placa;
        this.tiempo=tiempo;
        this.robot=robot;
    }
    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
}
