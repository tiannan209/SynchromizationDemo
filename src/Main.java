public class Main {

    public static void main(String[] args) {

        //System.out.println("Train line simulation!");
        //Line obj = new Line();
        //Train train1 = new Train(obj);
        //Train train2 = new Train(obj);
        //train1.start();
        //train2.start();

        /* demo for multi-thread counters */
        //System.out.println("Counters");
       // Counter counter = new Counter();
        //Thread threadA = new CounterThread(counter);
        //Thread threadB = new CounterThread(counter);
        //threadA.start();
        //threadB.start();

        Sender sender = new Sender();
        ThreadedSend ts1 = new ThreadedSend("Hello", sender);
        ThreadedSend ts2 = new ThreadedSend("Goodbye", sender);
        ts1.start();
        ts2.start();

        try
        {
            ts1.join();
            ts2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }
}
