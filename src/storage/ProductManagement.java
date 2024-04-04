package storage;

import file.RegexPattern;
import model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductManagement {
    private final List<Product> productList;
    private final Scanner scanner;

    public ProductManagement(Scanner scanner) {
        productList = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addMouse() {

        LocalDate localDate = null;

        System.out.println("Nhap ma san pham.");
        String id = RegexPattern.checkRegexMouseId();
        System.out.println("Nhap ten san pham:");
        String name = RegexPattern.checkCharacter();
        System.out.println("Nhap hang san xuat:");
        String brand = RegexPattern.checkCharacter();
        System.out.println("Nhap chat kieu san pham:");
        String material = RegexPattern.checkCharacter();
        System.out.println("Nhap do nhay cua chuot:");
        int dpi = Integer.parseInt(RegexPattern.checkNum());
        System.out.println("Nhap gia cua san pham: ");
        double cost = Double.parseDouble(RegexPattern.checkNum());
        System.out.println("Nhap so luong san pham:");
        int quantity = Integer.parseInt(RegexPattern.checkNum());

        boolean check = false;
        do {
            System.out.println("nhap ngay san xuat san pham (yyyy-mm-dd).");
            String input = scanner.nextLine();
            try {
                localDate = LocalDate.parse(input);
                check = true;
            } catch (DateTimeException e) {
                System.out.println("ngay thang ban nhap khong hop le");
            }
        } while (!check);
        Mouse mouse = new Mouse(id, name, brand, material, dpi, cost, quantity, localDate);
        productList.add(mouse);
    }

    public void addLaptop() {

        LocalDate localDate = null;

        System.out.println("Nhap ma san pham.");
        String id = RegexPattern.checkRegexMouseId();
        System.out.println("Nhap ten san pham:");
        String name = RegexPattern.checkCharacter();
        System.out.println("Nhap hang san xuat:");
        String brand = RegexPattern.checkCharacter();
        System.out.println("Nhap kich thuoc san pham:");
        double size = Double.parseDouble(RegexPattern.checkNum());
        System.out.println("Nhap dung luong Ram cua san pham:");
        int capacityRam = Integer.parseInt(RegexPattern.checkNum());
        System.out.println("Nhap dung luong Rom cua san pham:");
        int capacityRom = Integer.parseInt(RegexPattern.checkNum());
        System.out.println("Nhap dung luong pin cua san pham:");
        int capacityBattery = Integer.parseInt(RegexPattern.checkNum());
        System.out.println("Nhap gia cua san pham: ");
        double cost = Double.parseDouble(RegexPattern.checkNum());
        System.out.println("Nhap so luong san pham:");
        int quantity = Integer.parseInt(RegexPattern.checkNum());

        boolean check = false;
        do {
            System.out.println("nhap ngay san xuat san pham (yyyy/mm/dd).");
            String input = scanner.nextLine();
            try {
                localDate = LocalDate.parse(input);
                check = true;
            } catch (DateTimeException e) {
                System.out.println("ngay thang ban nhap khong hop le");
            }
        } while (!check);
        Laptop laptop = new Laptop(id, name, brand, size, capacityRam, capacityRom, capacityBattery, cost, quantity, localDate);
        productList.add(laptop);
    }

    public void addKeyboard() {
        LocalDate localDate = null;

        System.out.println("Nhap ma san pham.");
        String id = RegexPattern.checkRegexMouseId();
        System.out.println("Nhap ten san pham:");
        String name = RegexPattern.checkCharacter();
        System.out.println("Nhap hang san xuat:");
        String brand = RegexPattern.checkCharacter();
        System.out.println("Nhap chat kieu san pham:");
        String material = RegexPattern.checkCharacter();
        System.out.println("Nhap loai san pham:");
        String type = RegexPattern.checkCharacter();
        System.out.println("Nhap gia cua san pham: ");
        double cost = Double.parseDouble(RegexPattern.checkNum());
        System.out.println("Nhap so luong san pham:");
        int quantity = Integer.parseInt(RegexPattern.checkNum());
        boolean check = false;
        do {
            System.out.println("nhap ngay san xuat san pham (yyyy/mm/dd).");
            String input = scanner.nextLine();
            try {
                localDate = LocalDate.parse(input);
                check = true;
            } catch (DateTimeException e) {
                System.out.println("ngay thang ban nhap khong hop le");
            }
        } while (!check);
        Keyboard keyboard = new Keyboard(id, name, brand, material, type, cost, quantity, localDate);
        productList.add(keyboard);
    }

    public void addHeadphone() {

        LocalDate localDate = null;

        System.out.println("Nhap ma san pham.");
        String id = RegexPattern.checkRegexMouseId();
        System.out.println("Nhap ten san pham:");
        String name = RegexPattern.checkCharacter();
        System.out.println("Nhap hang san xuat:");
        String brand = RegexPattern.checkCharacter();
        System.out.println("Nhap chat kieu san pham:");
        String type = RegexPattern.checkCharacter();
        System.out.println("Nhap dung luong pin cua san pham:");
        int capacityBattery = Integer.parseInt(RegexPattern.checkNum());
        System.out.println("Nhap khoang cach ket noi cua san pham:");
        double connectionDistance = Double.parseDouble(RegexPattern.checkNum());
        System.out.println("Nhap gia cua san pham:");
        double cost = Double.parseDouble(RegexPattern.checkNum());
        System.out.println("Nhap so luong cua san pham:");
        int quantity = Integer.parseInt(RegexPattern.checkNum());
        boolean check = false;
        do {
            System.out.println("nhap ngay san xuat san pham (yyyy-mm-dd).");
            String input = scanner.nextLine();
            try {
                localDate = LocalDate.parse(input);
                check = true;
            } catch (DateTimeException e) {
                System.out.println("ngay thang ban nhap khong hop le");
            }
        } while (!check);
        Headphone headphone = new Headphone(id, name, brand, type, capacityBattery, connectionDistance, cost, quantity, localDate);
        productList.add(headphone);
    }


    public void addCharger() {

        LocalDate localDate = null;

        System.out.println("Nhap ma san pham.");
        String id = RegexPattern.checkRegexMouseId();
        System.out.println("Nhap ten san pham:");
        String name = RegexPattern.checkCharacter();
        System.out.println("Nhap hang san xuat:");
        String brand = RegexPattern.checkCharacter();
        System.out.println("Nhap cong suat cau san pham");
        double wattage = Double.parseDouble(RegexPattern.checkNum());
        System.out.println("Nhap gia cua san pham:");
        double cost = Double.parseDouble(RegexPattern.checkNum());
        System.out.println("Nhap so luong cua san pham:");
        int quantity = Integer.parseInt(RegexPattern.checkNum());

        boolean check = false;
        do {
            System.out.println("nhap ngay san xuat san pham (yyyy-mm-dd).");
            String input = scanner.nextLine();
            try {
                localDate = LocalDate.parse(input);
                check = true;
            } catch (DateTimeException e) {
                System.out.println("ngay thang ban nhap khong hop le");
            }
        } while (!check);
        Charger charger = new Charger(id, name, brand, wattage, cost, quantity, localDate);
        productList.add(charger);
    }

    public void updateProduct() {
        System.out.println("nhap ma san pham ban muon chinh sua.");
        String id = scanner.nextLine();
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                System.out.println(product.toString());
                if (product instanceof Mouse) {
                }
            }
        }
    }
}