package multithreading;

public class Value {
    int counter;

    public synchronized int getCounter() {
        return counter;
    }

    public synchronized  void setCounter(int counter) {
        this.counter = counter;
    }

    public Value(){
        this.counter = 0;
    }
}
