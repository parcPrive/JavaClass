import java.util.Scanner;

public class Quiz01 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("두자리 수를 입력하세요.");
    int num = scanner.nextInt();
    
    if(num >= 10){
      if(num /10 == num % 10){
      System.out.println("십의 자리랑 일의 자리 수가 같다." + num);
    }else{
      System.out.println("십의 자리랑 일의 자리수가 다르다." + num);
    }
    }else{
      System.out.println("10보다 큰수를 입력하세요.");
    }
  }
}
