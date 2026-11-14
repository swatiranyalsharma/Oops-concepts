package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Value v = new Value();
        // int counter = 0;
        Lock lock = new ReentrantLock();
        Adder A = new Adder(v);
        Future<Void> future1 = pool.submit(A);
        Subtractor S = new Subtractor(v);
        Future<Void> future2 = pool.submit(S);
        try {
            future1.get();
            future2.get();
        } catch (Exception e) {
        } finally {
            pool.shutdown();
        }

        System.out.println(v.counter);

    }
}
