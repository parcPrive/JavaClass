import java.util.Scanner;

public class BreakTest{
public static void main(String[] args) {


  Scanner scanner = new Scanner(System.in);
  System.out.println("exit를 입력하면 종료합니다.");
  while(true){
    String msg  = scanner.nextLine();
    if(msg.equals("exit") || msg.equals("Exit")){
      break;
    }
    System.out.println("종료합니다.");
  }
  }

}