import java.util.Scanner;

public class changeMoney {
  public static void main(String[] args) {
    int remain  = 0;
    int util[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
    Scanner scanner = new Scanner(System.in);
    System.out.println("금액을 입력하시면 지폐로 바꿔드립니다.");
    int money = scanner.nextInt();
    for(int i = 0; i < util.length; i++){
      remain = money / util[i];
      // if(remain != 0){
      //   System.out.println(" " + util[i] + "원" + remain + "장");
      // }
      if(remain == 0){
        continue;
      }
      System.out.println(" " + util[i] + "원" + remain + "장");
      money = money % util[i];
    }
  }
  
}
