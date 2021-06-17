package blocking.queue;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {

    private BlockingQueue queue;

    public void setQueue(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Consumer size before = " + queue.size());
                System.out.println(" <- consumed " + queue.take() + " size = " + queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
