package repetition.concurrency;

public class InventoryManagerDemo {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Thread inventoryTask = new Thread((new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProduct();
            }
        }));

        Thread displayTask = new Thread((new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProducts();
            }
        }));

        inventoryTask.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        displayTask.start();
    }
}