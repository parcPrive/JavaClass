import java.util.Scanner;

public class ContinueTest {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int i = 0;
    int sum = 0;
    while(i < 5){
      int num = scanner.nextInt();
      i++;
      if(num <0){
        continue;
      }
      sum += num;
    }
    System.out.println(sum);
  }
}
