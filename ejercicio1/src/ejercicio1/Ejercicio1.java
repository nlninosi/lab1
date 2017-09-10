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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City p1 = new City();

        Robot vh = new Robot(p1, 5, 0, Direction.EAST,5);
        Robot vh1 = new Robot(p1, 5, 0, Direction.EAST,5);
        Robot vh2 = new Robot(p1, 5, 0, Direction.EAST,5);
        Robot vh3 = new Robot(p1, 5, 0, Direction.EAST,5);
        Robot vh4 = new Robot(p1, 5, 0, Direction.EAST,5);
        Robot vh5 = new Robot(p1, 5, 0, Direction.EAST,5);
        Robot vh6 = new Robot(p1, 5, 0, Direction.EAST,5);
        
        Wall blockAve0 = new Wall(p1, 0, 1, Direction.NORTH);
        Wall blockAve1 = new Wall(p1, 0, 2, Direction.NORTH);
        Wall blockAve22 = new Wall(p1, 0, 3, Direction.NORTH);
        Wall blockAve2 = new Wall(p1, 0, 1, Direction.WEST);
        Wall blockAve3 = new Wall(p1, 1, 1, Direction.WEST);
        Wall blockAve4 = new Wall(p1, 2, 1, Direction.WEST);
        Wall blockAve5 = new Wall(p1, 3, 1, Direction.WEST);
        Wall blockAve6 = new Wall(p1, 4, 1, Direction.WEST);
        Wall blockAve7 = new Wall(p1, 0, 2, Direction.WEST);
        Wall blockAve8 = new Wall(p1, 1, 2, Direction.WEST);
        Wall blockAve9 = new Wall(p1, 2, 2, Direction.WEST);
        Wall blockAve10 = new Wall(p1, 3, 2, Direction.WEST);
        Wall blockAve11 = new Wall(p1, 4, 2, Direction.WEST);
        Wall blockAve12 = new Wall(p1, 0, 3, Direction.EAST);
        Wall blockAve13 = new Wall(p1, 1, 3, Direction.EAST);
        Wall blockAve14 = new Wall(p1, 2, 3, Direction.EAST);
        Wall blockAve15 = new Wall(p1, 3, 3, Direction.EAST);
        Wall blockAve16 = new Wall(p1, 4, 3, Direction.EAST);
        Wall blockAve23 = new Wall(p1, 0, 3, Direction.WEST);
        Wall blockAve27 = new Wall(p1, 1, 3, Direction.WEST);
        Wall blockAve24 = new Wall(p1, 2, 3, Direction.WEST);
        Wall blockAve25 = new Wall(p1, 3, 3, Direction.WEST);
        Wall blockAve26 = new Wall(p1, 4, 3, Direction.WEST);
        Wall blockAve17 = new Wall(p1, 4, 4, Direction.NORTH);
        Wall blockAve18 = new Wall(p1, 4, 5, Direction.NORTH);
        Wall blockAve19 = new Wall(p1, 4, 6, Direction.NORTH);
        Wall blockAve20 = new Wall(p1, 4, 7, Direction.NORTH);
        Wall blockAve21 = new Wall(p1, 4, 7, Direction.EAST);
        
        
        Vehiculo v1=new Vehiculo(1,1,vh);
        Vehiculo v2=new Vehiculo(2,1,vh1);
        Vehiculo v3=new Vehiculo(3,1,vh2);
        Vehiculo v4=new Vehiculo(4,1,vh3);
        Vehiculo v5=new Vehiculo(5,1,vh4);
        Vehiculo v6=new Vehiculo(6,1,vh5);
        Vehiculo v7=new Vehiculo(7,1,vh6);
        Parqueadero parqueadero= new Parqueadero();
        Seccion s1=new Seccion();
        parqueadero.addSeccion(s1);
        Seccion s2=new Seccion();
        parqueadero.addSeccion(s2);
        Seccion s3=new Seccion();
        parqueadero.addSeccion(s3);
        
        parqueadero.addVehiculo(v1);
        parqueadero.addVehiculo(v2);
        parqueadero.addVehiculo(v3);
        parqueadero.addVehiculo(v4);
        parqueadero.addVehiculo(v5);
        parqueadero.addVehiculo(v6);
        parqueadero.addVehiculo(v7);
        parqueadero.sacarVehiculo(v1, s1);
        parqueadero.addVehiculo(v1);
          
                   
    }
    
}
