import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("홍길동");
    arrayList.add("임꺽정");
    arrayList.add("심청이");
    arrayList.add("고길동");
    arrayList.add(0,"둘리");

    for(int i = 0; i < arrayList.size(); i++){
      System.out.println(arrayList.get(i));
    }

 System.out.println("==================================");
    // arrayList.clear(); // arrayList안을 싹지운다.
    // arrayList.remove("고길동"); // 인덱스로도 지울수 있고 이방식으로도 지울수가있다.

    arrayList.set(0,"희동이"); //0번째에있는 둘리를 희동이로 바꿀수있다.
    // System.out.println(arrayList.isEmpty()); //isEmpty()는 길이가 0이면 true 아니면 false
            for(String str : arrayList){
      System.out.println(str);
    }
    System.out.println(arrayList.contains("둘리"));
    
System.out.println("==================================");

    Integer arr[] = {11, 22, 33, 44, 55};  // int arr[]로 배열을 만들면 ArrayList의 타입은 Integer여서 오류가 떠서 배열의 타입도 int에서 Integer로 바꿔줘야 오류가 사라진다.
    ArrayList<Integer> intArrayList = new ArrayList<>(
      Arrays.asList(arr)
    );
    System.out.println(intArrayList.get(0));
    ArrayList<String> name = new ArrayList<>(
      Arrays.asList("둘리", "미켈란젤로", "다빈치", "심청이")
    );
    int idx = 0;
    //   for(String str : name){
    //   System.out.println(str.length());
    // }
    for(int i = 0; i < name.size(); i++){
      if(name.get(i).length() > name.get(idx).length()){
        idx = i;

      }
    }
    System.out.println(name.get(idx));


        String strArray[] = {"둘리", "희동이", "도우너"};

    ArrayList<String> strArrayList = new ArrayList<>(
      Arrays.asList(strArray)
    );
    System.out.println(strArrayList.get(0));
    System.out.println(strArrayList.get(1));
    System.out.println(strArrayList.get(2));
  }

  
}
