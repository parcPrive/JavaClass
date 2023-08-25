import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneExplorer {
  public static void main(String[] args) {
    File file = new File("/Users/junghunmok/Desktop/\u1109\u116E\u110B\u1165\u11B8/phone.txt");
    Map<String, String> phonMap = new HashMap<>();
    try {
      FileReader fileReader = new FileReader(file);
      Scanner scanner = new Scanner(fileReader);
      System.out.println(file.getPath() + "를 출력합니다.");
      while(scanner.hasNext()){
        String str = scanner.nextLine();
        phonMap.put(str.split(" ")[0], str.split(" ")[1]);
      }
      scanner.close();
      System.out.println(phonMap.get("정현목"));
      Scanner phoneScanner = new Scanner(System.in);
      while(true){
        System.out.println("이름을 입력하세요.");
        String name = phoneScanner.next();
        if(name.equals("그만")) break;
        String tel = phonMap.get(name);
        if(tel == null) System.out.println("없는 사랍입니다.");
        else System.out.println(tel);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}
