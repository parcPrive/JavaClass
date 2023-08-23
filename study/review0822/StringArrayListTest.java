package review0822;

import java.util.ArrayList;

public class StringArrayListTest {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>(); // java에서는 배열 같은거를 새로만들떄에는 new 뒤에에는 타입을 한번더 사용한다.!!!
    arrayList.add("홍");
    arrayList.add("길");
    arrayList.add("동");
    arrayList.add("목");
    arrayList.add("현");
    for(int i = 0; i < arrayList.size(); i++){
      System.out.println(arrayList.get(i));
    }
    System.out.println("==============================");
    arrayList.set(3,"짜잔"); // set을 사용하면 내가 원하는곳의 내용을 추가할수있다 단. arrayList.size()안에서만 가능하다. set을 보면 인덱스 범위가 0보다는 크고 size()보다는 같거나 같을때이다. 
    for(String str : arrayList){
      System.out.println(str);
    }

    arrayList.remove("짜잔"); // remove안에 있는 내용을 찾아서 지우는 역활을하며 boolean을 리턴한다.
    System.out.println("==============================");
    for(String str : arrayList){
        System.out.println(str);
    }
  }
}
