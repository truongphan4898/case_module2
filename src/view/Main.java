package view;

import storage.ProductManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ProductManagement productManagement=new ProductManagement(scanner);
//        productManagement.addLaptop();
        productManagement.addMouse();
        productManagement.editMouseList();
    }
}
