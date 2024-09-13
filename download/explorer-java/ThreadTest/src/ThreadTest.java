public class ThreadTest {
    public static void main(String[] args) {
        Runnable r1 = new MyThread("*",100);
        Runnable r2 = new MyThread("!",1000);
        Runnable r3 = new MyThread("&",10000);
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
        public MyThread(String s, int sleepTime) {
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
        }
    }
}