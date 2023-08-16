import java.util.Scanner;

public class WordsQuiz {
  public static void main(String[] args) {
    String words[][] = {{"apple","사과"}, {"orange", "오랜지"}, {"plum","자두"}, {"grape", "포도"}};
    Scanner scanner = new Scanner(System.in);
    int pass = 0;
    int fail = 0;
  for(int i = 0; i < words.length; i++){
    for(int j = 1; j < words[i].length; j++){
      System.out.print(words[i][0] + "  한국어로? =>   ");
      String fuit = scanner.next();
      if(words[i][1].equals(fuit)){
        System.out.println("정답입니다.");
        pass++;
      }else{
        fail++;
        System.out.println("틀렸습니다.");
      }
    }
    System.out.println("정답 => " + pass+"개" + "  오답 => " + fail + " 개 맞췄습니다.");
  }
  }
}
