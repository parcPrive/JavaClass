import java.util.Scanner;

public class Quiz02 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("잔돈을 입력하면 됩니다.");
    int won = scanner.nextInt();
    
    int oMan = won / 50000;
    int man = (won % 50000) /10000;
    int oChun = ((won % 50000)% 10000) /5000;
    int chun = (((won % 50000)% 10000) % 5000) / 1000;
    int oBak = ((((won % 50000)% 10000) % 5000) % 1000) /500;
    int bak = (((((won % 50000)% 10000) % 5000) % 1000) % 500) / 100;
    int oSip = ((((((won % 50000)% 10000) % 5000) % 1000) % 500) % 100) / 50;
    int sip = (((((((won % 50000)% 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;

    System.out.println("오만원권:"+oMan + "장" + " 만원권:" + man + "장"+ " 오천원권:" + oChun + "장" + " 천원권:" + chun + "장" + " 오백원짜리동전:" +oBak + "장" +  " 백원짜리동전:" + bak +"개" + " 오십원짜리동전:" + oSip + "개"+ " 십원짜리동전:" + sip + "개");
    
  }
}
