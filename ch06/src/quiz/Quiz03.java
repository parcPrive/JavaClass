package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz03 {
  public static void main(String[] args) {
    HashMap<String, Integer> nara = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    while(true){
      System.out.println("나라를 입력하세요.");
      String con = scanner.next();
       if(con.equals("1")) break;
      System.out.println("인구를 입력하세요.");
      int in = scanner.nextInt();
      nara.put(con, in);

    }
    System.out.println("인구를 확인하고싶은 나라를 입력하세여.");
    String search = scanner.next();
    System.out.println(nara.get(search));
  }
}
