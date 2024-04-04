package model;

import java.time.LocalDate;

public class Charger extends Product{
   private double wattage;

    public Charger(double wattage) {
        this.wattage = wattage;
    }

    public Charger(String id, String name, String brand, double wattage, double cost, int quantity, LocalDate localDate) {
        super(id, name, brand, cost, quantity, localDate);
        this.wattage = wattage;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Charger{" +
                "wattage=" + wattage +
                '}'+super.toString();
    }
}
