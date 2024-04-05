package storage;

import file.FileProduct;
import file.ReadWriteFile;
import file.RegexPattern;
import model.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class ProductManagement implements ShowList {
    private final List<Mouse> mouseList;
    private final List<Laptop> laptopList;
    private final List<Keyboard> keyboardList;
    private final List<Headphone> headphoneList;
    private final List<Charger> chargerList;

    private final FileProduct fileProduct;
    private static final Scanner scanner = new Scanner(System.in);

    public ProductManagement() {
        mouseList = new ArrayList<>();
        laptopList = new ArrayList<>();
        keyboardList = new ArrayList<>();
        headphoneList = new ArrayList<>();
        chargerList = new ArrayList<>();
        this.fileProduct = new FileProduct();
    }

    public ProductManagement(List<Mouse> mouseList, List<Laptop> laptopList, List<Keyboard> keyboardList, List<Headphone> headphoneList, List<Charger> chargerList, FileProduct fileProduct, Scanner scanner) {
        this.mouseList = mouseList;
        this.laptopList = laptopList;
        this.keyboardList = keyboardList;
        this.headphoneList = headphoneList;
        this.chargerList = chargerList;
        this.fileProduct = fileProduct;

    }

    public List<Mouse> getMouseList() {
        return mouseList;
    }

    public List<Laptop> getLaptopList() {
        return laptopList;
    }

    public List<Keyboard> getKeyboardList() {
        return keyboardList;
    }

    public List<Headphone> getHeadphoneList() {
        return headphoneList;
    }

    public List<Charger> getChargerList() {
        return chargerList;
    }

    public void addMouse() {

        LocalDate localDate = null;

        System.out.println("Nhap ma san pham.");
        String id = RegexPattern.checkRegexMouseId();
        System.out.println("Nhap ten san pham:");
        String name = RegexPattern.checkCharacter();
        System.out.println("Nhap hang san xuat:");
        String brand = RegexPattern.checkCharacter();
        System.out.println("Nhap chat lieu san pham:");
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
        mouseList.add(mouse);
        fileProduct.writeToFile(FileProduct.getFileMousePath(), mouseList);
    }

    public void addLaptop() {

        LocalDate localDate = null;

        System.out.println("Nhap ma san pham.");
        String id = RegexPattern.checkRegexLaptopId();
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
        laptopList.add(laptop);
        fileProduct.writeToFile(FileProduct.getFileLaptopPath(), laptopList);
    }

    public void addKeyboard() {
        LocalDate localDate = null;

        System.out.println("Nhap ma san pham.");
        String id = RegexPattern.checkRegexKeyboadId();
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
        keyboardList.add(keyboard);
        fileProduct.writeToFile(FileProduct.getFileKeyboardPath(), keyboardList);
    }

    public void addHeadphone() {

        LocalDate localDate = null;

        System.out.println("Nhap ma san pham.");
        String id = RegexPattern.checkRegexHeadphoneId();
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
        headphoneList.add(headphone);
        fileProduct.writeToFile(FileProduct.getFileHeadphonePath(), headphoneList);
    }


    public void addCharger() {

        LocalDate localDate = null;

        System.out.println("Nhap ma san pham.");
        String id = RegexPattern.checkRegexChargerId();
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
        chargerList.add(charger);
        fileProduct.writeToFile(FileProduct.getFileChargerPath(), chargerList);
    }

    public void editMouseList() {
        if (mouseList.isEmpty()) {
            System.out.println("danh sach san pham dang trong.");
            return;
        }
        boolean check = false;
        do {
            boolean found = false;
            System.out.println("nhạp ma san pham can chinh sua.");
            String inputId = RegexPattern.checkRegexMouseId();
            for (Mouse mouse : mouseList) {
                if (mouse.getId().equals(inputId)) {
                    boolean exit = false;
                    while (!exit) {
                        System.out.println("chon muc can chinh sua:");
                        System.out.println("1. Id");
                        System.out.println("2. Name");
                        System.out.println("3. Brand");
                        System.out.println("4. Material");
                        System.out.println("5. Dpi");
                        System.out.println("6. Cost");
                        System.out.println("7. Quantity");
                        System.out.println("8. Input Day");
                        System.out.println("9. Exit");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("nhap ma san pham: " + mouse.getId());
                                String newId = RegexPattern.checkRegexMouseId();
                                mouse.setId(newId);
                                break;
                            case 2:
                                System.out.println("nhap ten san pham: " + mouse.getName());
                                String newName = RegexPattern.checkCharacter();
                                mouse.setName(newName);
                                break;
                            case 3:
                                System.out.println("nhap hang san xuat: " + mouse.getBrand());
                                String newBrand = RegexPattern.checkCharacter();
                                mouse.setBrand(newBrand);
                                break;
                            case 4:
                                System.out.println("nhap chat lieu san pham: " + mouse.getMaterial());
                                String newMaterial = RegexPattern.checkCharacter();
                                mouse.setMaterial(newMaterial);
                                break;
                            case 5:
                                System.out.println("do nhay cua san pham: " + mouse.getDpi());
                                int newPdi = Integer.parseInt(RegexPattern.checkNum());
                                mouse.setDpi(newPdi);
                                break;
                            case 6:
                                System.out.println("nhap gia san pham: " + mouse.getCost());
                                double newCost = Double.parseDouble(RegexPattern.checkNum());
                                mouse.setCost(newCost);
                                break;
                            case 7:
                                System.out.println("nhap so luong san pham: " + mouse.getQuantity());
                                int newQuantity = Integer.parseInt(RegexPattern.checkNum());
                                mouse.setQuantity(newQuantity);
                                break;
                            case 8:
                                boolean checkDay = false;
                                LocalDate newLocalDate = null;
                                do {
                                    System.out.println("nhap ngay san xuat san pham (yyyy-mm-dd): " + mouse.getLocalDate());
                                    String input = scanner.nextLine();
                                    try {
                                        newLocalDate = LocalDate.parse(input);
                                        check = true;
                                    } catch (DateTimeException e) {
                                        System.out.println("ngay thang ban nhap khong hop le");
                                    }
                                } while (!checkDay);
                                mouse.setLocalDate(newLocalDate);
                                break;
                            case 9:
                                System.out.println("Quay ve menu chinh");
                                exit = true;
                                break;
                            default:
                                System.out.println("nhap lai muc can chinh sua.");

                        }
                        System.out.println("thong tin san pham da duoc chinh sua.");
                        found = true;

                    }

                }

            }
            if (!found) {
                System.out.println("ma ban nhap khong dung vui long nhap lai.");
            } else {
                check = true;
            }
        } while (!check);
        fileProduct.writeToFile(FileProduct.getFileMousePath(), mouseList);

    }

    public void editLaptopList() {
        if (laptopList.isEmpty()) {
            System.out.println("danh sach san pham dang trong.");
            return;
        }
        boolean check = true;
        do {
            boolean found = false;
            System.out.println("nhạp ma san pham can chinh sua.");
            String inputId = RegexPattern.checkRegexLaptopId();
            for (Laptop laptop : laptopList) {
                if (laptop.getId().equals(inputId)) {
                    boolean exit = false;
                    while (!exit) {
                        System.out.println("chon muc can chinh sua:");
                        System.out.println("1. Id");
                        System.out.println("2. Name");
                        System.out.println("3. Brand");
                        System.out.println("4. Size");
                        System.out.println("5. Capacity Ram");
                        System.out.println("6. Capacity Rom");
                        System.out.println("7. Capacity Battery");
                        System.out.println("8. Cost");
                        System.out.println("9. Quantity");
                        System.out.println("10. Input Day");
                        System.out.println("11. Exit");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("nhap ma san pham: " + laptop.getId());
                                String newId = RegexPattern.checkRegexLaptopId();
                                laptop.setId(newId);
                                break;
                            case 2:
                                System.out.println("nhap ten san pham: " + laptop.getName());
                                String newName = RegexPattern.checkCharacter();
                                laptop.setName(newName);
                                break;
                            case 3:
                                System.out.println("nhap hang san xuat: " + laptop.getBrand());
                                String newBrand = RegexPattern.checkCharacter();
                                laptop.setBrand(newBrand);
                                break;
                            case 4:
                                System.out.println("nhap chat lieu san pham: " + laptop.getSize());
                                double newSize = Double.parseDouble(RegexPattern.checkNum());
                                laptop.setSize(newSize);
                                break;
                            case 5:
                                System.out.println("nhap dung luong Ram cua san pham: " + laptop.getCapacityRam());
                                int newCapacityRam = Integer.parseInt(RegexPattern.checkNum());
                                laptop.setCapacityRam(newCapacityRam);
                                break;
                            case 6:
                                System.out.println("nhap dung luong bo nho cua san pham: " + laptop.getCapacityRom());
                                int newCapacityRom = Integer.parseInt(RegexPattern.checkNum());
                                laptop.setCapacityRom(newCapacityRom);
                                break;
                            case 7:
                                System.out.println("nhap dung luong pin cua san pham: " + laptop.getCapacityBattery());
                                int newCapacityBattery = Integer.parseInt(RegexPattern.checkNum());
                                laptop.setCapacityBattery(newCapacityBattery);
                                break;
                            case 8:
                                System.out.println("nhap gia san pham: " + laptop.getCost());
                                double newCost = Double.parseDouble(RegexPattern.checkNum());
                                laptop.setCost(newCost);
                                break;
                            case 9:
                                System.out.println("nhap so luong san pham: " + laptop.getQuantity());
                                int newQuantity = Integer.parseInt(RegexPattern.checkNum());
                                laptop.setQuantity(newQuantity);
                                break;
                            case 10:
                                boolean checkDay = false;
                                LocalDate newLocalDate = null;
                                do {
                                    System.out.println("nhap ngay san xuat san pham (yyyy-mm-dd): " + laptop.getLocalDate());
                                    String input = scanner.nextLine();
                                    try {
                                        newLocalDate = LocalDate.parse(input);
                                        check = true;
                                    } catch (DateTimeException e) {
                                        System.out.println("ngay thang ban nhap khong hop le");
                                    }
                                } while (!checkDay);
                                laptop.setLocalDate(newLocalDate);
                                break;
                            case 11:
                                System.out.println("Quay ve menu chinh");
                                exit = true;
                                break;
                            default:
                                System.out.println("nhap lai muc can chinh sua.");

                        }
                        System.out.println("thong tin san pham da duoc chinh sua.");
                        found = true;

                    }

                }

            }
            if (!found) {
                System.out.println("ma ban nhap khong dung vui long nhap lai.");
            } else {
                check = false;
            }
        } while (!check);
        fileProduct.writeToFile(FileProduct.getFileLaptopPath(), laptopList);
    }

    public void editKeyboardList() {
        if (keyboardList.isEmpty()) {
            System.out.println("danh sach san pham dang trong.");
            return;
        }
        boolean check = false;
        do {
            boolean found = false;
            System.out.println("nhạp ma san pham can chinh sua.");
            String inputId = RegexPattern.checkRegexKeyboadId();
            for (Keyboard keyboard : keyboardList) {
                if (keyboard.getId().equals(inputId)) {
                    boolean exit = false;
                    while (!exit) {
                        System.out.println("chon muc can chinh sua:");
                        System.out.println("1. Id");
                        System.out.println("2. Name");
                        System.out.println("3. Brand");
                        System.out.println("4. Material");
                        System.out.println("5. Type");
                        System.out.println("6. Cost");
                        System.out.println("7. Quantity");
                        System.out.println("8. Input Day");
                        System.out.println("9. Exit");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("nhap ma san pham: " + keyboard.getId());
                                String newId = RegexPattern.checkRegexKeyboadId();
                                keyboard.setId(newId);
                                break;
                            case 2:
                                System.out.println("nhap ten san pham: " + keyboard.getName());
                                String newName = RegexPattern.checkCharacter();
                                keyboard.setName(newName);
                                break;
                            case 3:
                                System.out.println("nhap hang san xuat: " + keyboard.getBrand());
                                String newBrand = RegexPattern.checkCharacter();
                                keyboard.setBrand(newBrand);
                                break;
                            case 4:
                                System.out.println("nhap chat lieu san pham: " + keyboard.getMaterial());
                                String newMaterial = RegexPattern.checkCharacter();
                                keyboard.setMaterial(newMaterial);
                                break;
                            case 5:
                                System.out.println("nhap laoi san pham: " + keyboard.getType());
                                String newType = RegexPattern.checkCharacter();
                                keyboard.setType(newType);
                            case 6:
                                System.out.println("nhap gia san pham: " + keyboard.getCost());
                                double newCost = Double.parseDouble(RegexPattern.checkNum());
                                keyboard.setCost(newCost);
                                break;
                            case 7:
                                System.out.println("nhap so luong san pham: " + keyboard.getQuantity());
                                int newQuantity = Integer.parseInt(RegexPattern.checkNum());
                                keyboard.setQuantity(newQuantity);
                                break;
                            case 8:
                                boolean checkDay = false;
                                LocalDate newLocalDate = null;
                                do {
                                    System.out.println("nhap ngay san xuat san pham (yyyy-mm-dd): " + keyboard.getLocalDate());
                                    String input = scanner.nextLine();
                                    try {
                                        newLocalDate = LocalDate.parse(input);
                                        check = true;
                                    } catch (DateTimeException e) {
                                        System.out.println("ngay thang ban nhap khong hop le");
                                    }
                                } while (!checkDay);
                                keyboard.setLocalDate(newLocalDate);
                                break;
                            case 9:
                                System.out.println("Quay ve menu chinh");
                                exit = true;
                            default:
                                System.out.println("nhap lai muc can chinh sua.");

                        }
                        System.out.println("thong tin san pham da duoc chinh sua.");
                        found = true;

                    }

                }

            }
            if (!found) {
                System.out.println("ma ban nhap khong dung vui long nhap lai.");
            } else {
                check = false;
            }
        } while (check);
        fileProduct.writeToFile(FileProduct.getFileKeyboardPath(), keyboardList);
    }

    public void editHeadphoneList() {
        if (headphoneList.isEmpty()) {
            System.out.println("danh sach san pham dang trong.");
            return;
        }
        boolean check = true;
        do {
            boolean found = false;
            System.out.println("nhạp ma san pham can chinh sua.");
            String inputId = RegexPattern.checkRegexHeadphoneId();
            for (Headphone headphone : headphoneList) {
                if (headphone.getId().equals(inputId)) {
                    while (true) {
                        System.out.println("chon muc can chinh sua:");
                        System.out.println("1. Id");
                        System.out.println("2. Name");
                        System.out.println("3. Brand");
                        System.out.println("4. Type");
                        System.out.println("5. Capacity Battery");
                        System.out.println("6. Connection Distance");
                        System.out.println("7. Cost");
                        System.out.println("8. Quantity");
                        System.out.println("9. Input Day");
                        System.out.println("10. Exit");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("nhap ma san pham: " + headphone.getId());
                                String newId = RegexPattern.checkRegexHeadphoneId();
                                headphone.setId(newId);
                                break;
                            case 2:
                                System.out.println("nhap ten san pham: " + headphone.getName());
                                String newName = RegexPattern.checkCharacter();
                                headphone.setName(newName);
                                break;
                            case 3:
                                System.out.println("nhap hang san xuat: " + headphone.getBrand());
                                String newBrand = RegexPattern.checkCharacter();
                                headphone.setBrand(newBrand);
                                break;
                            case 4:
                                System.out.println("nhap loai san pham: " + headphone.getType());
                                String newType = RegexPattern.checkCharacter();
                                headphone.setType(newType);
                                break;
                            case 5:
                                System.out.println("nhap dung luong pin cua san pham: " + headphone.getCapacityBattery());
                                int newCapacityBattery = Integer.parseInt(RegexPattern.checkNum());
                                headphone.setCapacityBattery(newCapacityBattery);
                                break;
                            case 6:
                                System.out.println("nhap khoang cach ket noi cua san pham: " + headphone.getConnectionDistance());
                                double newConnectionDistance = Double.parseDouble(RegexPattern.checkNum());
                                headphone.setConnectionDistance(newConnectionDistance);
                                break;
                            case 7:
                                System.out.println("nhap gia san pham: " + headphone.getCost());
                                double newCost = Double.parseDouble(RegexPattern.checkNum());
                                headphone.setCost(newCost);
                                break;
                            case 8:
                                System.out.println("nhap so luong san pham: " + headphone.getQuantity());
                                int newQuantity = Integer.parseInt(RegexPattern.checkNum());
                                headphone.setQuantity(newQuantity);
                                break;
                            case 9:
                                boolean checkDay = false;
                                LocalDate newLocalDate = null;
                                do {
                                    System.out.println("nhap ngay san xuat san pham (yyyy-mm-dd): " + headphone.getLocalDate());
                                    String input = scanner.nextLine();
                                    try {
                                        newLocalDate = LocalDate.parse(input);
                                        check = true;
                                    } catch (DateTimeException e) {
                                        System.out.println("ngay thang ban nhap khong hop le");
                                    }
                                } while (!checkDay);
                                headphone.setLocalDate(newLocalDate);
                                break;
                            case 10:
                                System.out.println("exiting...");
                                System.exit(0);
                            default:
                                System.out.println("nhap lai muc can chinh sua.");

                        }
                        System.out.println("thong tin san pham da duoc chinh sua.");
                        found = true;

                    }

                }

            }
            if (!found) {
                System.out.println("ma ban nhap khong dung vui long nhap lai.");
            } else {
                check = false;
            }
        } while (check);
        fileProduct.writeToFile(FileProduct.getFileHeadphonePath(), headphoneList);
    }

    public void editChargerList() {
        if (chargerList.isEmpty()) {
            System.out.println("danh sach san pham dang trong.");
            return;
        }
        boolean check = true;
        do {
            boolean found = false;
            System.out.println("nhạp ma san pham can chinh sua.");
            String inputId = RegexPattern.checkRegexChargerId();
            for (Charger charger : chargerList) {
                if (charger.getId().equals(inputId)) {
                    while (true) {
                        System.out.println("chon muc can chinh sua:");
                        System.out.println("1. Id");
                        System.out.println("2. Name");
                        System.out.println("3. Brand");
                        System.out.println("4. Wattage");
                        System.out.println("5. Cost");
                        System.out.println("6. Quantity");
                        System.out.println("7. Input Day");
                        System.out.println("8. Exit");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("nhap ma san pham: " + charger.getId());
                                String newId = RegexPattern.checkRegexChargerId();
                                charger.setId(newId);
                                break;
                            case 2:
                                System.out.println("nhap ten san pham: " + charger.getName());
                                String newName = RegexPattern.checkCharacter();
                                charger.setName(newName);
                                break;
                            case 3:
                                System.out.println("nhap hang san xuat: " + charger.getBrand());
                                String newBrand = RegexPattern.checkCharacter();
                                charger.setBrand(newBrand);
                                break;
                            case 4:
                                System.out.println("Nhap cong suat cua san pham: " + charger.getWattage());
                                double newWattage = Double.parseDouble(RegexPattern.checkNum());
                                break;

                            case 5:
                                System.out.println("nhap gia san pham: " + charger.getCost());
                                double newCost = Double.parseDouble(RegexPattern.checkNum());
                                charger.setCost(newCost);
                                break;
                            case 6:
                                System.out.println("nhap so luong san pham: " + charger.getQuantity());
                                int newQuantity = Integer.parseInt(RegexPattern.checkNum());
                                charger.setQuantity(newQuantity);
                                break;
                            case 7:
                                boolean checkDay = false;
                                LocalDate newLocalDate = null;
                                do {
                                    System.out.println("nhap ngay san xuat san pham (yyyy-mm-dd): " + charger.getLocalDate());
                                    String input = scanner.nextLine();
                                    try {
                                        newLocalDate = LocalDate.parse(input);
                                        check = true;
                                    } catch (DateTimeException e) {
                                        System.out.println("ngay thang ban nhap khong hop le");
                                    }
                                } while (!checkDay);
                                charger.setLocalDate(newLocalDate);
                                break;
                            case 8:
                                System.out.println("exiting...");
                                System.exit(0);
                            default:
                                System.out.println("nhap lai muc can chinh sua.");

                        }
                        System.out.println("thong tin san pham da duoc chinh sua.");
                        found = true;

                    }

                }

            }
            if (!found) {
                System.out.println("ma ban nhap khong dung vui long nhap lai.");
            } else {
                check = false;
            }
        } while (check);
        fileProduct.writeToFile(FileProduct.getFileChargerPath(), chargerList);


    }


    public void showList(List<? extends Product> product) {
        if (product.isEmpty()) {
            System.out.println("danh sach san pham dang trong");
        } else {
            for (Product product1 : product) {
                System.out.println(product1.toString());
            }
        }
    }

    public void searchProductById() {
        System.out.println("Nhap ma san pham ban muon tim: ");
        String inputId = scanner.nextLine();
        boolean check = false;

        for (Mouse mouse : mouseList) {
            if (mouse.getId().equals(inputId)) {
                System.out.println(mouse.toString());
                check = true;
                break;
            }
        }
        for (Laptop laptop : laptopList) {
            if (laptop.getId().equals(inputId)) {
                System.out.println(laptop.toString());
                check = true;
                break;
            }
        }
        for (Keyboard keyboard : keyboardList) {
            if (keyboard.getId().equals(inputId)) {
                System.out.println(keyboard.toString());
                check = true;
                break;
            }
        }
        for (Headphone headphone : headphoneList) {
            if (headphone.getId().equals(inputId)) {
                System.out.println(headphone.toString());
                check = true;
                break;
            }
        }
        for (Charger charger : chargerList) {
            if (charger.getId().equals(inputId)) {
                System.out.println(charger.toString());
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("ma ban nhap khong dung.");
        }

    }

    public void deleteProductById() {
        System.out.println("Nhap ma san pham ban muon xoa: ");
        String inputId = scanner.nextLine();
        boolean check = false;

        for (Mouse mouse : mouseList) {
            if (mouse.getId().equals(inputId)) {
                System.out.println(mouse.toString());
                System.out.println("Nhan 'y' de xoa san pham, 'n' de thoat chuong trinh.");
                String input = scanner.nextLine();
                if (input.equals("y")) {
                    mouseList.remove(mouse);
                    System.out.println("Da xoa thanh cong.");
                    fileProduct.writeToFile(FileProduct.getFileMousePath(), mouseList);
                    break;
                } else if (input.equalsIgnoreCase("n")) {
                    System.out.println("thoat chương trình");
                    return;
                }
                check = true;

            }
        }
        for (Laptop laptop : laptopList) {
            if (laptop.getId().equals(inputId)) {
                System.out.println(laptop.toString());
                System.out.println("Nhan 'y' de xoa san pham, 'n' de thoat chuong trinh.");
                String input = scanner.nextLine();
                if (input.equals("y")) {
                    laptopList.remove(laptop);
                    System.out.println("Da xoa thanh cong.");
                    fileProduct.writeToFile(FileProduct.getFileLaptopPath(), laptopList);
                    break;
                } else if (input.equalsIgnoreCase("n")) {
                    System.out.println("thoat chương trình");
                    return;
                }
                check = true;

            }
        }
        for (Keyboard keyboard : keyboardList) {
            if (keyboard.getId().equals(inputId)) {
                System.out.println(keyboard.toString());
                System.out.println("Nhan 'y' de xoa san pham, 'n' de thoat chuong trinh.");
                String input = scanner.nextLine();
                if (input.equals("y")) {
                    keyboardList.remove(keyboard);
                    System.out.println("Da xoa thanh cong.");
                    fileProduct.writeToFile(FileProduct.getFileKeyboardPath(), keyboardList);
                    break;
                } else if (input.equalsIgnoreCase("n")) {
                    System.out.println("thoat chương trình");
                    return;
                }
                check = true;

            }
        }
        for (Headphone headphone : headphoneList) {
            if (headphone.getId().equals(inputId)) {
                System.out.println(headphone.toString());
                System.out.println("Nhan 'y' de xoa san pham, 'n' de thoat chuong trinh.");
                String input = scanner.nextLine();
                if (input.equals("y")) {
                    headphoneList.remove(headphone);
                    System.out.println("Da xoa thanh cong.");
                    fileProduct.writeToFile(FileProduct.getFileHeadphonePath(), headphoneList);
                    break;
                } else if (input.equalsIgnoreCase("n")) {
                    System.out.println("thoat chương trình");
                    return;
                }
                check = true;

            }
        }
        for (Charger charger : chargerList) {
            if (charger.getId().equals(inputId)) {
                System.out.println(charger.toString());
                System.out.println("Nhan 'y' de xoa san pham, 'n' de thoat chuong trinh.");
                String input = scanner.nextLine();
                if (input.equals("y")) {
                    chargerList.remove(charger);
                    System.out.println("Da xoa thanh cong.");
                    fileProduct.writeToFile(FileProduct.getFileChargerPath(), chargerList);
                    break;
                } else if (input.equalsIgnoreCase("n")) {
                    System.out.println("thoat chương trình");
                    return;
                }
                check = true;

            }
        }
        if (!check) {
            System.out.println("ma ban nhap khong dung.");
        }

    }

    @Override
    public void sortList(List<? extends Product> product) {
        if (product.isEmpty()) {
            System.out.println("danh sách san pham trong.");
            return;
        }
        System.out.println("nhap '1' de sap xep tang dan, '2' de sap xep giam dan.");
        String inputNum = scanner.nextLine();
        if (inputNum.equals("1")) {
            product.sort(new Comparator<Product>() {
                @Override
                public int compare(Product product, Product t1) {
                    return Double.compare(product.getCost(), t1.getCost());
                }
            });
            showList(product);
        } else if (inputNum.equals("2")) {
            product.sort(new Comparator<Product>() {
                @Override
                public int compare(Product product, Product t1) {
                    return Double.compare(t1.getCost(), product.getCost());
                }
            });
            showList(product);
        }

    }

    public void checkList() {
        if(mouseList.isEmpty()){
            System.out.println("danh sach chuot dang trong can them san pham.");
        }
        if(laptopList.isEmpty()){
            System.out.println("danh sach may tinh dang trong can them san pham.");
        }
        if(keyboardList.isEmpty()){
            System.out.println("danh sach ban phim dang trong can them san pham.");
        }
        if(headphoneList.isEmpty()){
            System.out.println("danh sach tai nghe dang trong can them san pham.");
        }
        if(chargerList.isEmpty()){
            System.out.println("danh sach sac dang trong can them san pham.");
        }
    }


}







