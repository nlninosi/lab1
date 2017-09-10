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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int continuar = 0, opcion = 0;
        Address a1= new Address("","","");
        Store s1= new Store(a1);
      do{
        System.out.println("1. Crear Carro");
        System.out.println("2. Listar Carros");
        opcion = in.nextInt();
        if(opcion == 1){
            System.out.println("Categoria:");
            String categoria = in.next();
            Category category=new Category(categoria);
            System.out.println("Numero del modelo:");
            String modelnumber = in.next();
            System.out.println("Precio:");
            int price = in.nextInt();
            CarModel carmodel= new CarModel(price,modelnumber,category);
            System.out.println("Kilometraje:");
            int traveled = in.nextInt();
            Car car= new Car(traveled,carmodel);
            int opcion1 = 0;
            System.out.println("Registrar en la tienda?: 1.Si 2.No");
            opcion1 = in.nextInt();
            if(opcion1==1){
                s1.addVehiculo(car);
            }else if(opcion1==2){
                
            }else{
                System.out.println("Opcion Invalida");
            }
        }else if(opcion == 2){
            s1.listar();
        }else{
            System.out.println("Opcion Invalida");
        }
        
      }while(continuar == 0);
    }
}
