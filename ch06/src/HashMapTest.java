import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapTest {
  public static void main(String[] args) {
    HashMap<String, String> dictionary = new HashMap<>();
    dictionary.put("apple", "사과");
    dictionary.put("apple", "홍로"); // 키값이 중복으로 되어있고 get으로 불러온다면 마지막에 일치하는 키값의 벨류를 불러온다. 그러므로 hashmap은 중복을 허용하지 않는다.
    dictionary.put("plum", "자두");
    dictionary.put("peach", "복숭아");

    System.out.println(dictionary.get("apple"));
    System.out.println(dictionary.get("plum"));
    System.out.println(dictionary.get("peach"));

    Set<String> keys = dictionary.keySet(); //keySet()을 사용하지위해서는 Set<>을 불러와서 사용해야한다.
    Iterator<String> it = keys.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }

     LinkedHashMap<String, String> dictionary02 = new LinkedHashMap<>(); 
    dictionary02.put("apple", "사과"); 
    dictionary02.put("plum", "자두");
    dictionary02.put("peach", "복숭아");

    System.out.println(dictionary02.keySet()); //LinkedHashMap은 순서를 보장해준다.
    System.out.println(dictionary.keySet()); //HashMap은 순서를 보장하지 않는다.

    HashMap<String, Integer> student = new HashMap<>();
    student.put("손흥민",77);
    student.put("김하성",88);
    student.put("류현진",88);
    
    for(String str : student.keySet()){
      System.out.println(student.get(str));

    }
    // Set<String> keys01 = student.keySet();
    // Iterator<String> scoreIt = keys01.iterator();
    // while(scoreIt.hasNext()){
    //   System.out.println(scoreIt.next());
    // }
    


  }
  
}
