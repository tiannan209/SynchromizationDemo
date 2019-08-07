public class Counter {

    long count = 0;

    public void add(long value){
        this.count += value;
    }

    public synchronized void threadSafeAdd(long value){
        this.count += value;
    }
}
