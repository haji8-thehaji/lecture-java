// 인사말을 출력하는 클래스
class test implements Runnable {
    private String message;

    // 생성자
    public test(String message) {
        this.message = message;
    }

    // run 메소드: 쓰레드가 실행할 작업을 정의합니다
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // "안녕하세요"를 출력할 쓰레드
        Thread thread1 = new Thread(new GreetingTask("안녕하세요"));

        // "반가워요"를 출력할 쓰레드
        Thread thread2 = new Thread(new GreetingTask("반가워요"));

        // 쓰레드 시작
        thread1.start();
        thread2.start();
    }
}
