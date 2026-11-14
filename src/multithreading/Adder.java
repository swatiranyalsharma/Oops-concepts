package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value counter;
    private Lock lock;

    public Adder(Value counter) {
        this.counter = counter;
        // this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100; i++) {
            // lock.lock();
            synchronized (counter) {
             counter.setCounter(counter.getCounter()+i);   
            }
           
            // lock.unlock();
        }
        return null;
    }
}
