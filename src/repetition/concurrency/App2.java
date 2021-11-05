package repetition.concurrency;

class Worker extends Thread {
    Sequence se;

    public Worker(Sequence se) {
        this.se = se;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getName() + " got value: " + se.getNext());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App2 {
    public static void main(String[] args) {
        Sequence se = new Sequence();
        Worker w1 = new Worker(se);
        Worker w2 = new Worker(se);

        w1.start();
        w2.start();
    }
}