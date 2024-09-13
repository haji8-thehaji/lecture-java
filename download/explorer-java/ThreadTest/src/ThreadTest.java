public class ThreadTest {
    public static void main(String[] args) {
        Runnable r1 = new MyThread("*");
        Runnable r2 = new MyThread("!");
        Runnable r3 = new MyThread("&");

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
        public MyThread(String s) {
            this.string = s;
        }

        @Override
        public void run() {
            System.out.println(string);
        }
    }
}