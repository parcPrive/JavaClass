public class ConditionTest {
  public static void main(String[] args) {
    boolean open = true;
    if(open){
      System.out.println("가게가 문을 열었다.");
    }else{
      System.out.println("문닫음");
    }

    int score = 85;
    if(score > 90){
      System.out.println("A");
    }else if(score > 80){
      System.out.println("B");
    }

    int num = 10;
    switch(num){
      case 10: System.out.println("10");
      break;
      default: System.out.println("없는 숫자 입니다.");
      break;
    }
    
  }
}
