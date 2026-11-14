import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(Thread.currentThread().getName());
        // HelloWorldPrinter hwp = new HelloWorldPrinter();
        // Thread t = new Thread(hwp);
        // // hwp.display();
        // t.start();
        // System.out.println("After start of thread");
        // User u1 = new User();
        // ExecutorService pool = Executors.newCachedThreadPool();
        ExecutorService pool = Executors.newFixedThreadPool(2);
        // Executors(factory for pool creation)
        // ExecutorService (handler)

        // Thread pool creation can be done using two factory methods:
        // newFixedThreadPool - thread count stays same
        // newCachedThreadPool - thread count grows and shink as per workload

        // for(int i=0;i<=100;i++){
        // HelloWorldPrinter hwp = new HelloWorldPrinter(i);
        // // Thread t = new Thread(hwp);
        // // t.start();
        // // pool.execute(hwp); //fire and forget
        // Future<Integer> res = pool.submit(hwp);
        // }/
        for (int i = 0; i <= 5; i++) {
            HelloWorldPrinter hwp = new HelloWorldPrinter(i);
            Future<Integer> res = pool.submit(hwp);
            int result = res.get();
            System.out.println(result);
        }
        //execute - Accepts runnable and returns nothing(fire and foreget)
        //submit - Accepts callable(or a Runnable) and immediately hands back a Future
        pool.shutdown();
    }
}
