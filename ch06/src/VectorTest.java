import java.util.Vector;

public class VectorTest {
  public static void main(String[] args) {
    // List(순서가 있고 중복 허용)/ Set(순서 없음, 중복 허용 안함)/ Map(key value key값은 중복 불가, value값은 중복 허용) Map<String,Integer>
    Vector <Integer> vec = new Vector<>();
    vec.add(100);
    vec.add(200);
    vec.add(300);
    // System.out.println(vec.get(1));
    for(int i = 0; i < vec.size(); i++){
      System.out.println(vec.get(i));
    }

    // advanced
    for(int i : vec){
      System.out.println(i);
    }

    String animals = "호랑이, 사자, 토끼, 거북이";
    // animals를 쪼개서 StringVec에 넣고싶다.
    Vector<String> stringVec = new Vector<>();
    // String aaa[] = new String[4];
    // aaa = animals.split(", ");
    String aaa[] = animals.split(", ");
    System.out.println(animals.split(", "));
    for(int i = 0; i < aaa.length; i++){
      stringVec.add(aaa[i]);
    }
    for(int i = 0; i < stringVec.size(); i++){
      System.out.println(stringVec.get(i));
    }
    stringVec.add("캥거루");
    stringVec.remove(stringVec.size() -1 ); // 

    


  }
  
}
