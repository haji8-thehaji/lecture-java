import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeTest {
    public static void main(String[] args) {
        // 현재 시간
        LocalTime now = LocalTime.now();
        // 현재시간 출력
        System.out.println(now);  // 06:20:57.008731300
        // 포맷 정의하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
            "HH시 mm분 ss초");
        // 포맷 적용하기
        String formatedNow = now.format(formatter);
        // 포맷 적용된 현재 시간 출력
        System.out.println(formatedNow);  // 06시 20분 57초
        
    }
}
