package model;

import java.time.LocalDate;
import java.util.Date;

public class Product {
    private String id;
    private String name;

    private LocalDate  localDate;
    private double cost;
    private int quantity;
    private String brand;

    public Product() {
    }

    public Product(String id, String name, String brand, double cost, int quantity,LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.localDate = localDate;
        this.cost = cost;
        this.quantity = quantity;
        this.brand=brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", localDate=" + localDate +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", brand='" + brand + '\'' +
                '}';
    }
}
