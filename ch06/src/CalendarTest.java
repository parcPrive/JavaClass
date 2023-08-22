import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
  public static void main(String[] args) {
    String monthArray[]  = {"Jan", "Feb", "Mar", "Apr", " May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    String dayArray[] = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    Calendar calendar = Calendar.getInstance(); // Calendar는 abstract이기 떄문에 new를 사용하지 못함.
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH); // 여기값에 +1을 해줘야 한국의 월과같다.
    int date = calendar.get(Calendar.DAY_OF_MONTH);
    int day = calendar.get(Calendar.DAY_OF_WEEK);
    int hour = calendar.get(Calendar.HOUR); // 12시간 기준
    int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24시간 기준
    int ampm = calendar.get(Calendar.AM_PM); // 오전 0 오후 1

    int min = calendar.get(Calendar.MINUTE);
    int sec = calendar.get(Calendar.SECOND);
    
    System.out.println(year + "/" + monthArray[month] + "/" + date + "/"+ dayArray[day -1] + "/" + hour);
    System.out.println(hourOfDay);
    System.out.println(ampm);
    // System.out.println(month);
    // System.out.println(calendar);
    // Date data = new Date();
    if(hour >= 5 || hour <=11){
      System.out.println("GoodMornning");
    }else if(hour >= 12 || hour <= 17){
      System.out.println("GoodAfternoon");
    }else if(hour >=18 && hour <=21){
      System.out.println("Goode Evening");
    }else{
      System.out.println("Good Night");
    }
  }
}
