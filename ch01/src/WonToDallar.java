import java.util.Scanner;

public class WonToDallar {
  public static void main(String[] args) {
    // 변하지 않는 상우 double타입의 rate 1380
    // 정수를 입력 받아서 1870000을 입력하면 몇달러인지 알려주는
    final double rate = 1380.0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("환화를 입력하세요.");
    int won = scanner.nextInt();
    System.out.println(Math.round((won/rate) * 100) / 100.0);
  }
}
