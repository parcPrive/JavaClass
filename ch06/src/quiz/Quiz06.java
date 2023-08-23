package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz06 {
  public static void main(String[] args) {
    HashMap<String,String> nara = new HashMap<>();
    nara.put("대한민국", "서울");
    nara.put("일본","도쿄");
    nara.put("중국","베이징");
    nara.put("북한", "평양");
    nara.put("미국","워싱턴");
    // String naraArray[] = {"대한민국","일본","중국", "북한", "미국"};
    // ArrayList<Integer> nums = new ArrayList<>(
    //   Arrays.asList(0,1,2,3,4)
    // );  
    // Scanner scanner = new Scanner(System.in);
    // while(true){
    //   Integer ran = (int)Math.floor((Math.random() * 5));
    //   if(nums.size() == 0){
    //     System.out.println("문제가없습니다.");
    //     break;
    //   }
    //   System.out.println(nums.size());
    //   if(nums.remove(ran)){
    //      System.out.println(naraArray[ran] + "의 수도를 적으세여.");
    //       String input = scanner.next();
    //       if(input.equals("그만")) break;
    //       if(nara.get(naraArray[ran]).equals(input)){
    //         System.out.println("딩동댕");
    //       }else{
    //         System.out.println("떙");
    //       }
    //   }
     
    // }
    // ================내가 짠 코드=============================
    Set<String> keys = nara.keySet();
    Object keyArray[] = keys.toArray();
    // System.out.println(keyArray.length);
    int total = keyArray.length;
    Iterator<String> values = nara.values().iterator();
    Iterator<Map.Entry<String, String>> entries = nara.entrySet().iterator();
    Scanner scanner = new Scanner(System.in);
    while(entries.hasNext()){
      String keyValue = entries.next().getKey();
      System.out.println(keyValue + " : " + nara.get(keyValue));
    }
    while(true){
      int ran = (int) (Math.random() * total);
      String question = (String) keyArray[ran];
      String answer = nara.get(question);
      System.out.println(question +"의 수도는");
      String capital = scanner.next();
      if(capital.equals("그만")) break;
      if(answer.equals(capital)){
        System.out.println("딩동댕");
      }else{
        System.out.println("땡");
      }
    } 
    // System.out.println(keyArray[ran]);
  }
}


//나라와 수도를 10개 입력하고 랜덤으로 나라 이름이 출력 되고 수도를 맞추면 딩동댕 아니면 떙 그만쓰면 빠져나가기