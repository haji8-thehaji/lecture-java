import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // 자동차 객체 생성
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("명령을 선택하세요 (U: 기어 업, D: 기어 다운, Q: 종료): ");
            String input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "U":
                    myCar.gearUp();
                    break;
                case "D":
                    myCar.gearDown();
                    break;
                case "Q":
                    running = false;
                    System.out.println("프로그램을 종료합니다.");
                    continue;
                default:
                    System.out.println("잘못된 입력입니다.");
            }

            myCar.showCurrentState(); // 현재 상태 출력 및 동작 수행
        }

        scanner.close();
    }
}

