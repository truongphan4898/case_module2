package view;

import file.FileProduct;
import model.Product;
import storage.ProductManagement;


import java.util.List;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManagement productManagement = new ProductManagement(scanner);
        Main main=new Main();
        FileProduct fileProduct=new FileProduct();
        fileProduct.readFromFile(FileProduct.getFileMousePath());
        fileProduct.readFromFile(FileProduct.getFileLaptopPath());
        fileProduct.readFromFile(FileProduct.getFileKeyboardPath());
        fileProduct.readFromFile(FileProduct.getFileHeadphonePath());
        fileProduct.readFromFile(FileProduct.getFileChargerPath());

        productManagement.checkList(productManagement.getMouseList());
        productManagement.checkList(productManagement.getLaptopList());
        productManagement.checkList(productManagement.getKeyboardList());
        productManagement.checkList(productManagement.getHeadphoneList());
        productManagement.checkList(productManagement.getChargerList());
        boolean exitProgram=false;
        while (! exitProgram) {
            System.out.println("------------MENU QUAN LY SAN PHAM------------");
            System.out.println();
            System.out.println("1. Hien thi danh sach san pham. ");
            System.out.println("2. Them san pham vao danh sach.");
            System.out.println("3. Chinh sua san pham.");
            System.out.println("4. Tim san pham theo ma. ");
            System.out.println("5. Sap xep san pham theo gia. ");
            System.out.println("6. Xoa san pham theo ma. ");
            System.out.println("7. thoat chuong trinh. ");
            System.out.println();
            System.out.println("Chon muc muon thuc hien.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    main.displayList(productManagement);
                    break;
                case 2:
                    main.addProduct(productManagement);
                    break;
                case 3:
                    main.updateProduct(productManagement);
                    break;
                case 4:
                    productManagement.searchProductById();
                    break;
                case 5:
                    main.sortProduct(productManagement);
                    break;
                case 6:
                    productManagement.deleteProductById();
                    break;
                case 7:
                    System.out.println("dang thoat....");
                    exitProgram=true;
                    break;
                default:
                    System.out.println("chon muc muon thuc hien.");
            }

        }
    }
    public void displayList(ProductManagement productManagement){
        Scanner scanner=new Scanner(System.in);
        boolean exitDisplayList = false;

        while (! exitDisplayList){
            System.out.println("chon danh sach muon hien thi:");
            System.out.println();
            System.out.println("1. Danh sach chuot may tinh.");
            System.out.println("2. Danh sach laptop." );
            System.out.println("3. Danh sach ban phim. ");
            System.out.println("4. Danh sach tai nghe. ");
            System.out.println("5. Danh sach sac. ");
            System.out.println("6. Thoat...");
            int num= Integer.parseInt(scanner.nextLine());
            switch (num){
                case 1:
                    productManagement.showList(productManagement.getMouseList());
                    break;
                case 2:
                    productManagement.showList(productManagement.getLaptopList());
                    break;
                case 3:
                    productManagement.showList(productManagement.getKeyboardList());
                    break;
                case 4:
                    productManagement.showList(productManagement.getHeadphoneList());
                    break;
                case 5:
                    productManagement.showList(productManagement.getChargerList());
                    break;
                case 6:
                    System.out.println("Quay ve menu chinh ....");
                    exitDisplayList = true;
                    break;
                default:
                    System.out.println("Chon danh sach muon hien thi. ");

            }
        }
    }
    public void addProduct(ProductManagement productManagement){
        Scanner scanner=new Scanner(System.in);
        boolean exitAddProduct = false;

        while (! exitAddProduct){
            System.out.println("chon danh sach muon them san pham: ");
            System.out.println();
            System.out.println("1. Danh sach chuot may tinh.");
            System.out.println("2. Danh sach laptop." );
            System.out.println("3. Danh sach ban phim. ");
            System.out.println("4. Danh sach tai nghe. ");
            System.out.println("5. Danh sach sac. ");
            System.out.println("6. Thoat...");
            int num= Integer.parseInt(scanner.nextLine());
            switch (num){
                case 1:
                   productManagement.addMouse();
                    break;
                case 2:
                    productManagement.addLaptop();
                    break;
                case 3:
                    productManagement.addKeyboard();
                    break;
                case 4:
                    productManagement.addHeadphone();
                    break;
                case 5:
                    productManagement.addCharger();
                    break;
                case 6:
                    System.out.println("Quay ve menu chinh ....");
                    exitAddProduct = true;
                    break;
                default:
                    System.out.println("Chon danh sach muon them san pham. ");

            }
        }
    }
    public void updateProduct(ProductManagement productManagement){
        Scanner scanner=new Scanner(System.in);
        boolean exitUpdateProduct = false;

        while (! exitUpdateProduct){
            System.out.println("chon danh sach san pham muon chinh sua :");
            System.out.println();
            System.out.println("1. Danh sach chuot may tinh.");
            System.out.println("2. Danh sach laptop." );
            System.out.println("3. Danh sach ban phim. ");
            System.out.println("4. Danh sach tai nghe. ");
            System.out.println("5. Danh sach sac. ");
            System.out.println("6. Thoat...");
            int num= Integer.parseInt(scanner.nextLine());
            switch (num){
                case 1:
                    productManagement.editMouseList();
                    break;
                case 2:
                    productManagement.editLaptopList();
                    break;
                case 3:
                    productManagement.editKeyboardList();
                    break;
                case 4:
                    productManagement.editHeadphoneList();
                    break;
                case 5:
                    productManagement.editChargerList();
                    break;
                case 6:
                    System.out.println("Quay ve menu chinh ....");
                    exitUpdateProduct = true;
                default:
                    System.out.println("Chon danh sach muon chinh sua. ");

            }
        }
    }
    public void sortProduct(ProductManagement productManagement){
        Scanner scanner=new Scanner(System.in);
        boolean exitSortProduct = false;

        while (! exitSortProduct){
            System.out.println("chon danh sach muon sap xep:");
            System.out.println();
            System.out.println("1. Danh sach chuot may tinh.");
            System.out.println("2. Danh sach laptop." );
            System.out.println("3. Danh sach ban phim. ");
            System.out.println("4. Danh sach tai nghe. ");
            System.out.println("5. Danh sach sac. ");
            System.out.println("6. Thoat...");
            int num= Integer.parseInt(scanner.nextLine());
            switch (num){
                case 1:
                    productManagement.sortList(productManagement.getMouseList());
                    break;
                case 2:
                    productManagement.sortList(productManagement.getLaptopList());
                    break;
                case 3:
                    productManagement.sortList(productManagement.getKeyboardList());
                    break;
                case 4:
                    productManagement.sortList(productManagement.getHeadphoneList());
                    break;
                case 5:
                    productManagement.sortList(productManagement.getChargerList());
                    break;
                case 6:
                    System.out.println("Quay ve menu chinh ....");
                    exitSortProduct = true;
                default:
                    System.out.println("Chon danh sach muon hien thi. ");

            }
        }
    }
}
