import java.util.Scanner;

class Dictionary {
  static String kor[] = {"사과", "자두", "포도"};
  static String eng[] = {"apple", "plum", "grape"};

   static public String korToEng(String word){
    for(int i = 0; i < kor.length; i++) {
      if(kor[i].equals(word)){
        return eng[i];
      }

    }
    return null;
  }
}



public class DictionaryTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(true){
      String kor = scanner.next();
      if(kor.equals("그만")){
        return;
      }else if(Dictionary.korToEng(kor) != null){
        System.out.println(Dictionary.korToEng(kor));
      }else{
        System.out.println("틀렸습니다. 과일을 다시 입력해주세요. 그만하고싶으시면 그만을 입력해주세요.");
      }
    }
  }
}
