import java.util.Scanner;

public class OperatorTest {
  public static void main(String[] args) {
    // 초를 정수로 입력받기
    // 5000 몇시간 몇분 몇초인지 출력
    Scanner scanner = new Scanner(System.in);
    int time = scanner.nextInt();
    int hour = time / 3600; 
    int minute =(time - (hour * 3600)) / 60;
    int sec =  (time - (hour * 3600)) - (minute * 60);

    // int sec = time % 60;
    // int min = (time / 60) % 60;
    // int hour = (time /60) /60
    
    // System.out.println(hour);
    System.out.println(hour + "시"+ minute + "분" + sec + "초" );
  }
}
