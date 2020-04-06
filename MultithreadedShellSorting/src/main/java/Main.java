import java.util.Random;

public class Main {

    public static void main(String[] args) {

        long start;
        long end;
        Random rn = new Random();
        int[] arr = new int[236126];
        int offset = arr.length / 2;
        int[] part1 = new int[offset];
        int[] part2;
        if (offset * 2 != arr.length) {
            part2 = new int[offset + 1];
        } else part2 = new int[offset];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(10);
            if (i < offset) {
                part1[i] = arr[i];
            }
            if (i >= offset) {
                part2[i - offset] = arr[i];
            }
        }

        try {

            start = System.currentTimeMillis();
            MultiThreads mss = new MultiThreads(part1, part2);
            mss.getThread().join();
            arr = mss.getArr();
            end = System.currentTimeMillis();
            System.out.println("Multithreaded Shell sorting.\nTime: " + (end - start) + "ms. arr length is " + arr.length);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }


}
