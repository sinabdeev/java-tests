package blocking.queue;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {

    private BlockingQueue queue;
    private Counter counter;

    public void setQueue(BlockingQueue queue) {
        this.queue = queue;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (true) {
            int element = counter.getCounter();
            counter.increment();
            try {
                System.out.println("Producer size before = " + queue.size());
                queue.put(element);
                System.out.println(" -> produced " + element + " size = " + queue.size());
            } catch (InterruptedException e) {
            }
        }
    }
}