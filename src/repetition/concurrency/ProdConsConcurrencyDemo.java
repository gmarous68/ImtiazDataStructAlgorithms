package repetition.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConsConcurrencyDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<>(5);
        Thread t1 = new Thread(new ProducerConcurrency(questionQueue));
        Thread t2 = new Thread(new ConsumerConcurrency(questionQueue));

        t1.start();
        t2.start();
    }
}