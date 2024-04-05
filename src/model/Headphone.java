package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Headphone extends Product implements Serializable {
   private String type;
   private  int capacityBattery;
   private double connectionDistance;

   public Headphone(String type, int capacityBattery, double connectionDistance) {
      this.type = type;
      this.capacityBattery = capacityBattery;
      this.connectionDistance = connectionDistance;
   }

   public Headphone(String id, String name, String brand, String type, int capacityBattery, double connectionDistance, double cost, int quantity, LocalDate localDate) {
      super(id, name, brand, cost, quantity, localDate);
      this.type = type;
      this.capacityBattery = capacityBattery;
      this.connectionDistance = connectionDistance;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public int getCapacityBattery() {
      return capacityBattery;
   }

   public void setCapacityBattery(int capacityBattery) {
      this.capacityBattery = capacityBattery;
   }

   public double getConnectionDistance() {
      return connectionDistance;
   }

   public void setConnectionDistance(double connectionDistance) {
      this.connectionDistance = connectionDistance;
   }

   @Override
   public String toString() {
      return  "Id: "+super.getId()+" | name: "+super.getName()+" | brand: "+super.getBrand()+" | Type: "+getType()+
              " | CapacityBattery: "+getCapacityBattery()+" | Connection Distance: "+getConnectionDistance()+
              " | cost: " +getCost()+" | quantity: "+ getQuantity()+" | Date: "+super.getLocalDate();

   }
}
