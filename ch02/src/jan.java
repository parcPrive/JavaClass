import java.util.Arrays;
import java.util.Scanner;

public class jan {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int won = scanner.nextInt();
    int jan[] = new int[8];
    int re = 0;
    int oMan = 50000;
    for(int i = 0; i < jan.length; i++){
      if(i == 0){
        jan[i] = won / oMan;
        
      }else if(i % 2 == 1 ){
        re = won - jan[i - 1] * oMan;
        oMan /= 5;
        jan[i] = re / oMan;
        won = re;
        System.out.println("홀수 .여긴 re => " + re);
        System.out.println("홀수 .여긴 won => " + won);

      }else{
        re = won - jan[i - 1] * oMan;
        oMan /= 2;
        jan[i] = re / oMan;
        won = re;
   
   
      }
    }
    
    System.out.println(Arrays.toString(jan));
  }
  
}
