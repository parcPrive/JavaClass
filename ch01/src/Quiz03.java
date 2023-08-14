import java.util.Scanner;

public class Quiz03 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    while(true){
      int num = scanner.nextInt();
      System.out.println(num/3 +"==" + num%3);
      if(num >= 100){
        return;
      }else{
        if((num % 10 == 3 || num % 10 == 6 || num % 10 == 9) && (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) ){
          System.out.println(" 짝 짝"); 
        }else if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9 || num / 10 == 3 || num / 10 == 6 || num / 10 == 9){
          System.out.println("짝");
        }
      }
      

    }
  }
}
