package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Keyboard extends Product implements Serializable {
   private String material;
   private String type;


    public Keyboard(String material, String type, double weight) {
        this.material = material;
        this.type = type;

    }

    public Keyboard(String id, String name, String brand, String material, String type, double cost, int quantity, LocalDate localDate) {
        super(id, name, brand, cost, quantity, localDate);
        this.material = material;
        this.type = type;

    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return  "Id: "+getId()+" | name: "+getName()+" | brand: "+getBrand()+" | material: "+getMaterial()+
                " | Type: "+getType()+" | cost: "+getCost()+" | quantity: "+ getQuantity()+" | Date: "+getLocalDate();

    }
}
