package file;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileProduct implements ReadWriteFile {

    private static final String FILE_MOUSE_PATH = "/Volumes/DATA/Module_2/CaseModule2/src/mine.txt";
    private static final String FILE_LAPTOP_PATH = "/Volumes/DATA/Module_2/CaseModule2/src/laptop.txt";
    private static final String FILE_KEYBOARD_PATH = "/Volumes/DATA/Module_2/CaseModule2/src/keyboard.txt";
    private static final String FILE_HEADPHONE_PATH = "/Volumes/DATA/Module_2/CaseModule2/src/headphone.txt";
    private static final String FILE_CHARGER_PATH = "/Volumes/DATA/Module_2/CaseModule2/src/charger.txt";

    public static String getFileMousePath() {
        return FILE_MOUSE_PATH;
    }

    public static String getFileLaptopPath() {
        return FILE_LAPTOP_PATH;
    }

    public static String getFileKeyboardPath() {
        return FILE_KEYBOARD_PATH;
    }

    public static String getFileHeadphonePath() {
        return FILE_HEADPHONE_PATH;
    }

    public static String getFileChargerPath() {
        return FILE_CHARGER_PATH;
    }


    @Override
    public List<? extends Product> readFromFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File does not exist. Creating new list.");
            return new ArrayList<>();
        }
        List<? extends Product> productList = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            productList = (List<? extends Product>) inputStream.readObject();
            System.out.println("Dữ liệu đã được đọc từ file " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Đã xảy ra lỗi khi đọc từ file: " + e.getMessage());
        }
        return productList;
    }


    @Override
    public void writeToFile(String fileName, List<? extends Product> products) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(products);
            System.out.println("Đã ghi danh sách sản phẩm vào file " + fileName);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi vào file: " + e.getMessage());
        }
    }
}
