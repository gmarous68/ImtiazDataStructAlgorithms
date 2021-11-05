package repetition.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
    List<Product> soldList = new CopyOnWriteArrayList<>();
    List<Product> purchList = new ArrayList<>();

    public void populateSoldProduct() {
        for(int i=0; i<100; i++) {
            Product pr = new Product(i, " test_product_" + i);
            soldList.add(pr);
            System.out.println("ADDED: " + pr);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProducts() {
        for(Product pr : soldList) {
            System.out.println("SOLD: " + pr);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}