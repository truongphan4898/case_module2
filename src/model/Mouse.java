package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Mouse extends Product implements Serializable {
    private String material;
    private int dpi;

    public Mouse( String material, double weight, int dpi) {

        this.material = material;
        this.dpi = dpi;
    }

    public Mouse(String id, String name, String brand ,  String material, int dpi, double cost, int quantity, LocalDate localDate) {
        super(id, name, brand, cost, quantity, localDate);

        this.material = material;
        this.dpi = dpi;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "Id: "+super.getId()+" | name: "+super.getName()+" | brand: "+super.getBrand()+" | material: "+getMaterial()+
                " | dpi: "+getDpi()+" | cost: "+getCost()+" | quantity: "+ getQuantity()+" | Date: "+super.getLocalDate();

    }
}
