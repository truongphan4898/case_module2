package file;

import model.Product;

import java.util.List;

public interface  ReadWriteFile {
    public List<? extends Product> readToFile();
    public void writeToFile(List<? extends Product> products);


}
