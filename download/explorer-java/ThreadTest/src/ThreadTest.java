import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class ThreadTest {
    private static final Semaphore semaphore = new Semaphore(1); // Allows only one thread at a time

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        
        Runnable r1 = new MyThread(strList, "*", 3000);
        Runnable r2 = new MyThread(strList, "!", 3000);
        Runnable r3 = new MyThread(strList, "&", 3000);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("종료");
    }

    static class MyThread implements Runnable {
        private String string;
        private int sleepTime;
        private ArrayList<String> strList;

        public MyThread(ArrayList<String> strList, String s, int sleepTime) {
            this.strList = strList;
            this.string = s;
            this.sleepTime = sleepTime;
        }

        @Override
        public void run() {
            try {
                // Acquire the semaphore before modifying the shared resource
                semaphore.acquire();
                Thread.sleep(sleepTime);
                try {
                    System.out.println(string);
                    strList.add(string);
                    System.out.println(strList);
                } finally {
                    // Release the semaphore after modifying the shared resource
                    semaphore.release();
                }
            } catch (InterruptedException ex) {
                // Handle exception
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }
}