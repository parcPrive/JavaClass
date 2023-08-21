package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String splitStr[] = str.split(" ");
    System.out.println(Arrays.toString(splitStr));
    System.out.println(splitStr.length);
  }
  
}
