import java.util.Scanner;

public class Quiz04 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    while(true){
      
      int year = scanner.nextInt();
     
       if((year % 4 == 0 && year % 100 != 0)|| (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)){
      System.out.println("윤년이다." + "  %4=>"+year % 4 + "    %4, 100 =>" + year % 100 + "    % 100 => " +year % 400);
    }else {
      System.out.println("윤년이 아니다.");

    }
    }
   
  }
}
