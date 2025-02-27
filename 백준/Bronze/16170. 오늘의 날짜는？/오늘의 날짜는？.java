import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now(ZoneId.of("UTC"));

        System.out.println(now.getYear());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());
    }
}

