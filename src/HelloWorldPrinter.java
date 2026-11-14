
import java.util.concurrent.Callable;

public class HelloWorldPrinter implements Callable<Integer> {
    private int counter;
    public HelloWorldPrinter(int counter){
        this.counter = counter;
    }
    @Override 
    public Integer call(){
        // System.out.println(counter);
        System.out.println(Thread.currentThread().getName());
        int sum =0 ;
        for(int i=0;i<=counter;i++){
            sum+=i;
        }
        return sum;
    }
}
