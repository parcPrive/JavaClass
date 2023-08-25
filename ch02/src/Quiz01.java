import java.util.Scanner;

public class Quiz01 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    double sum = 0.0;
    int count = 0;
    while(true){
      int stop = scanner.nextInt();
      if(stop == -1){
        break;
      }
      sum += stop;
      count++;
      System.out.println("합은? => "+sum);
    }
    
    System.out.println(sum/count);
  }

  
  
}
