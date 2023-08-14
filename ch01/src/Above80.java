import java.util.Scanner;

public class Above80 {
  public static void main(String[] args) {
    // 키보드로부터 정수를 입력받아 80이상이면 합격 아니면 불합격
    Scanner scanner = new Scanner(System.in);
    int score = scanner.nextInt();
    
  if(score >= 80){
    System.out.println("합격");
  }else{
    System.out.println("불합격");
  }
  scanner.close();
  }
  
}
