public class ThreadedSend extends Thread {
    private String msg;
    //private Thread t;
    Sender sender;

    ThreadedSend(String m, Sender obj){
        this.msg = m;
        this.sender = obj;
    }

    public void run(){
        synchronized (sender) {
            sender.send(msg);
        }
    }
}
