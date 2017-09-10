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
public class CarModel {
    private int price;
    private String modelnumber;
    private Category category;
    public CarModel(int price, String modelnumber, Category category){
        this.modelnumber=modelnumber;
        this.category=category;
        this.price=price;
    }
    public Category getName() {
        return category;
    }
    public String getModelNumber() {
        return modelnumber;
    }
    
    public int getPrice() {
        return price;
    }
     @Override
    public String toString(){
        return "{Precio:"+price+" Categoria:"+category+" Numero del modelo:"+modelnumber+"}";
    }
    
}
