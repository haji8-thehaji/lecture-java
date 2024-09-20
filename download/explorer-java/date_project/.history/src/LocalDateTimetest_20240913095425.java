
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimetest {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatedNow =ldt.format(dtf);
        System.out.println(ldt);
        System.out.println(formatedNow);
        
    }
    
}
