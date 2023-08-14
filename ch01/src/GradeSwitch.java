import java.util.Scanner;

public class GradeSwitch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("점수를 입력하시오.");
    int score = scanner.nextInt();

    switch(score/10){
      case 10:
      case 9 : 
      System.out.println("A");
      break;

      case 8 : System.out.println("B");
      break;

      case 7 : System.out.println("C");
      break;

      case 6 : System.out.println("D");
      break;

      default: System.out.println("F");
      break;
    }

  }
}
