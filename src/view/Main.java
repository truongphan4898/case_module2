package view;

import model.Product;
import storage.ProductManagement;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ProductManagement productManagement=new ProductManagement(scanner);
//        productManagement.showList(productManagement.getMouseList());
        productManagement.sortList(productManagement.getMouseList());


    }
}
