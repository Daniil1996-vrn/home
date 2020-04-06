public class MultiThreads implements Runnable {
    private int[] array1;
    private int[] array2;
    private int[] arr;
    private Thread thread;

    public MultiThreads(int[] array1, int[] array2) {
        super();
        this.array1 = array1;
        this.array2 = array2;
        this.thread = new Thread(this);
        thread.start();
    }

   // @Override
    public void run() {
        try {
            ThreadsForShell one = new ThreadsForShell(array1);
            ThreadsForShell two = new ThreadsForShell(array2);
            one.getThread().join();
            two.getThread().join();
        } catch (InterruptedException e) {
        }
        arr = confluence(array1, array2);
    }

    private int[] confluence(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] confluenced = new int[length];
        int iter1 = 0;
        int iter2 = 0;
        for (int i = 0; i < length; i++) {
            if (iter1 == array1.length) {
                confluenced[i] = array2[iter2++];
            } else if (iter2 == array2.length) {
                confluenced[i] = array1[iter1++];
            } else {
                if (array1[iter1] < array2[iter2]) {
                    confluenced[i] = array1[iter1++];
                } else {
                    confluenced[i] = array2[iter2++];
                }
            }
        }
        return confluenced;
    }

    public Thread getThread() {
        return thread;
    }

    public int[] getArr() {
        return arr;
    }
}
