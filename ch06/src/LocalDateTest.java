import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTest {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    System.out.println(now);
    LocalTime nowTime = LocalTime.now();
    System.out.println(nowTime);
    LocalDateTime nowDateTime = LocalDateTime.now();
    System.out.println(nowDateTime);

  }
  
}