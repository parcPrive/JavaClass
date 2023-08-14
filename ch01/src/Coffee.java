import java.util.Scanner;

public class Coffee {
  public static void main(String[] args) {
    
    Scanner scanner= new Scanner(System.in);
    String coffee = scanner.next();
    int price = 0;
    // 문자열 비교는  ==이 아닌 equals라는 메서드를 사용해야한다.
    
    // System.out.println("주문하신 " + coffee + "의 가격은 " + price + "입니다.");

      // switch로 바꿔보기
  switch (coffee) {
    case "아메리카노": price = 2000;     
      break;
  
    case "카푸치노": price = 3000;
    break;

    case "카페라때": price = 3000;
    break;
  
    default: System.out.println("없는 메뉴입니다. 저희가 파는 커피는 아메리카노와 카푸치노뿐 입니다.");
      break;
      
  }
  System.out.println("주문하신 " + coffee + "의 가격은 " + price + "입니다.");
  }

}
