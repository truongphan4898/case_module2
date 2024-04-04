package model;

import java.time.LocalDate;

public class Laptop extends Product{

    private double size;
    private int capacityRam;
    private int capacityRom;
    private int capacityBattery;

    public Laptop( double size, int capacityRam, int capacityRom, int capacityBattery) {

        this.size = size;
        this.capacityRam = capacityRam;
        this.capacityRom = capacityRom;
        this.capacityBattery = capacityBattery;
    }
    public Laptop(String id, String name, String brand, double size, int capacityRam, int capacityRom, int capacityBattery, double cost, int quantity, LocalDate localDate){
        super(id,name,brand,cost,quantity,localDate);
        this.size = size;
        this.capacityRam = capacityRam;
        this.capacityRom = capacityRom;
        this.capacityBattery = capacityBattery;

    }
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getCapacityRam() {
        return capacityRam;
    }

    public void setCapacityRam(int capacityRam) {
        this.capacityRam = capacityRam;
    }

    public int getCapacityRom() {
        return capacityRom;
    }

    public void setCapacityRom(int capacityRom) {
        this.capacityRom = capacityRom;
    }

    public int getCapacityBattery() {
        return capacityBattery;
    }

    public void setCapacityBattery(int capacityBattery) {
        this.capacityBattery = capacityBattery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                ", size=" + size +
                ", capacityRam=" + capacityRam +
                ", capacityRom=" + capacityRom +
                ", capacityBattery=" + capacityBattery +
                '}'+ super.toString();
    }
}
