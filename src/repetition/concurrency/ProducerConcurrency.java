package repetition.concurrency;

import java.util.concurrent.BlockingQueue;

public class ProducerConcurrency implements Runnable {
    BlockingQueue<Integer> questionQueue;
    int questionNo;

    public ProducerConcurrency(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                synchronized (this) {
                    System.out.println("Got a new question: " + ++questionNo);
                    questionQueue.put(questionNo);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}