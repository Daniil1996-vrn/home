public class ThreadsForShell implements Runnable {
    private int[] arr;
    private Thread thread;

    public ThreadsForShell(int[] array) {
        super();
        this.arr = array;
        this.thread = new Thread(this);
        thread.start();
    }

    //@Override
    public void run() {
       // Main.shell(array);
    }

    public Thread getThread() {
        return thread;
    }
}
