import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // 현재 날짜/시간
        Date now = new Date();
 
        // 현재 날짜/시간 출력
        System.out.println(now); // Thu Jun 17 06:57:32 KST 2021
        
        // 포맷팅 정의
        SimpleDateFormat formatter = new SimpleDateFormat(
            "yyyy년 MM월 dd일 HH시 mm분 ss초");

        // // 포맷팅 적용
        String formatedNow = formatter.format(now);
        System.out.println(formatedNow); 
        

 
    }
}
