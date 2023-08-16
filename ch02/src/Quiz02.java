import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {
  public static void main(String[] args) {
    int sum01 = 0;
    int sum02 = 0;
    int count = 0;

    for(int i = 1; i <= 100; i++){
      if(i % 2 == 0){
        sum01 += i;
      }else{
        sum02 += i;
      }
    }
    System.out.println("for문 짝합=> " + sum01 + "   홀합 => " + sum02);
    sum01 = 0;
    sum02 = 0;
    
    while(count < 100){
      count++;
      if(count % 2 == 0){
        sum01 += count;
      }else{
        sum02 += count;
      }
    }

    System.out.println("while문 짝합=> " + sum01 + "   홀합 => " + sum02);


    Scanner scanner = new Scanner(System.in);
    int starNum = scanner.nextInt();
    String star = "*";
    for(int i = starNum; i > 0; i--){
      for(int j = i; j > 0; j--){
          System.out.print(star);
      }
      System.out.println("");
    }

    count = 0;
    int nums[] = new int[10];
    for(int i = 0; i < nums.length; i++){
      nums[i] = scanner.nextInt();
      if(nums[i] % 3 == 0){
        count++;
      }
    }
    System.out.println(count);


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

