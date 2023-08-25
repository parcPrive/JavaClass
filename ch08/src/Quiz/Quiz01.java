package Quiz;

import java.util.Scanner;

public class Quiz01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    for(int i = 0; i < 2; i++){
    try {
        int num = scanner.nextInt();
        sum += num;
    
    } catch (Exception e) {
      System.out.println("정수로 다시 입력하세요.");
      scanner.next();
      i--;
      continue;
      
    }
  }
  System.out.println(sum);
  }
}

//두수를 입력받아 결과를 출력하는 프로그램  이때 실수를 입력하면 오류나면서 종료되지 않게