package file;

import model.Product;

import java.util.List;

public interface  ReadWriteFile {
    public List<? extends Product> readFromFile(String fileName);
    public void writeToFile(String fileName, List<? extends Product> products);


}
