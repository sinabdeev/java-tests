/**
 * Решение проблемы производителя-потребителя
 * с помощью BlockingQueue
 */

import blocking.queue.Consumer;
import blocking.queue.Counter;
import blocking.queue.Producer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test01 {

    static int MAX_SIZE = 15;

    public static void main(String[] args) {

        BlockingQueue queue = new LinkedBlockingQueue(MAX_SIZE);
        Counter counter = new Counter();

        Producer producer1 = new Producer();
        producer1.setCounter(counter);
        producer1.setQueue(queue);

        Producer producer2 = new Producer();
        producer2.setCounter(counter);
        producer2.setQueue(queue);

        Producer producer3 = new Producer();
        producer3.setCounter(counter);
        producer3.setQueue(queue);


        Consumer consumer = new Consumer();
        consumer.setQueue(queue);

        //---------------------------
        producer1.start();
        producer2.start();
        producer3.start();

        consumer.start();
    }

}

