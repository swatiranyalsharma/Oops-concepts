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
        for(int i=0;i<=100;i++){
             HelloWorldPrinter hwp = new HelloWorldPrinter(i);
            Thread t = new Thread(hwp);
            t.start();
        }
        System.out.println("Number of processors"+Runtime.getRuntime().availableProcessors());
    }
}
