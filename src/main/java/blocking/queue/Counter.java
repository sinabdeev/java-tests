package blocking.queue;

public class Counter {

    private volatile int counter = 100;

    public synchronized void increment() {
        counter++;
        if (counter > 200) {
            System.exit(0);
        }
    }

    public int getCounter() {
        return counter;
    }
}