/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Nicolas
 */
public class Store {
    private Car[] car;
    private Address address;
    public int numVehiculos;
    public Store(Address address){
        this.address=address;
        this.car=new Car[20];
        this.numVehiculos=0;
    }
    public Address getAddress(){
        return address;
    }
    public boolean addVehiculo(Car car){
        System.out.println(this.numVehiculos);
        if(this.numVehiculos < 20){
            System.out.println(this.numVehiculos);
          this.car[this.numVehiculos] = car;
          this.numVehiculos++;
          System.out.println(this.numVehiculos);
          return true;
        }else
            return false;
    }
    public void listar(){
        for(int i=0;i<this.numVehiculos;i++){
            System.out.println(car[i]);
        }
    }
}
