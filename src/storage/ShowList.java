package storage;

import model.Product;

import java.util.List;

public interface ShowList {
    public void showList(List<? extends Product> product);
    public void sortList(List<? extends Product> product);
    public  void checkList(List<? extends Product> products);
}
