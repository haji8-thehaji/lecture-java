
import java.util.ArrayList;

public class ThreadTest {
    public static void main(String[] args) {

        ArrayList strList = new ArrayList<String>();
        
        Runnable r1 = new MyThread(strList, "*",100);
        Runnable r2 = new MyThread(strList, "!",100);
        Runnable r3 = new MyThread(strList, "&",100);
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
        private ArrayList strList;
        public MyThread(ArrayList strList, String s, int sleepTime) {
            this.strList = strList;
            this.string = s;
            this.sleepTime = sleepTime;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException ex) {
            }
            System.out.println(string);
            strList.add(string);
            System.out.println(strList);

        }
    }
}