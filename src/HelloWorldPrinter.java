public class HelloWorldPrinter implements Runnable {
    private int counter;
    public HelloWorldPrinter(int counter){
        this.counter = counter;
    }
    @Override 
    public void run(){
        display();
    }
    public void display(){
     
        // for(int i=0;i<=100;i++){
            System.out.println(counter);
               System.out.println(Thread.currentThread().getName());
        // }
    }
}
