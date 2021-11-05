package repetition.concurrency;

import java.util.concurrent.BlockingQueue;

public class ConsumerConcurrency implements Runnable {
    BlockingQueue<Integer> questionQueue;

    public ConsumerConcurrency(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                System.out.println("ANSWERED QUESTION: " + questionQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}