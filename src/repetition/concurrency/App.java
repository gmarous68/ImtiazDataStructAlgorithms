package repetition.concurrency;

class Task extends Thread {
    String name;

    public Task(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(this.name);

        for(int i=0; i<100; i++) {
            System.out.println("Value of i: " + i + " - " + name);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        Task t1 = new Task("This is thread 1");
        t1.start();

        Task t2 = new Task("This is thread 2");
        t2.start();
    }
}