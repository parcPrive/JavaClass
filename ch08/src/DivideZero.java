import java.util.Scanner;

/**
 * DivideZero
 */
public class DivideZero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  while(true){
    System.out.println("숫자를 입력하세요.");
    int num = scanner.nextInt();
    System.out.println("나눌 수를 입력하세요.");
    int div = scanner.nextInt();
  try{
      System.out.println(num + "을" + div +"로 나누면" + num / div + " 입니다.");
    

  }catch(ArithmeticException e){
    // System.out.println("어떤 수를 0으로 나눌 수없다.!");
    e.printStackTrace();
  }
  System.out.println("나는 나올까요?");
  }

  }
}