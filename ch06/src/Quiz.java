import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) { 
    ArrayList<Integer> nums = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    // boolean aaa = true;
    while(true){
      int num = scanner.nextInt();
      if(num == -1) break;
      nums.add(num);
    }

    int max = 0;
    // Collections.sort(nums); //sort를 사용할수있다.
    for(int i = 0; i < nums.size(); i++){
      if(nums.get(i) > max){
        max = nums.get(i);
      }
    }
    System.out.println(max);
    
  }

}
