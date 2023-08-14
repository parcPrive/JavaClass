import java.util.Scanner;

public class AbsTest {
  public static void main(String[] args) {
    // 양수 두개의 차이를 양수로 표현하기
    Scanner scanner = new Scanner(System.in);
    // int a = 3;
    // int b = 5;
    // int c = a - b;
    // if(c < 0){
    //   c = b -a;
    // }
    
    // System.out.println(c);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int abs = a  - b;
    System.out.println(Math.abs(abs));
  }
  
}
