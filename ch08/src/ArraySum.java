import java.util.Scanner;

public class ArraySum {
  public static void main(String[] args) {
    int sum = 0;
    Scanner scanner = new Scanner(System.in);
      for(int i = 0; i < 3; i++){
      try {
        int num = scanner.nextInt();
        sum += num;
      }catch (Exception e) {
      // TODO: handle exception
      System.out.println("정수를 다시 입력해주세여.");
      scanner.next();
      i--;
      continue;
    }

  }
  System.out.println("수의 합 =>"+sum);
  }
}
