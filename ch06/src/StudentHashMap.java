import java.util.HashMap;
import java.util.UUID;

class Student{
  private int id;
  private String tel;
  
  public Student(int id, String tel) {
    this.id = id;
    this.tel = tel;
  }

  public int getId() {
    return id;
  }

  public String getTel() {
    return tel;
  }
  
}

public class StudentHashMap {
  public static void main(String[] args) {
    HashMap<String, Student> studentMap = new HashMap<>();
    studentMap.put("정현목", new Student(1,"01011111111"));// Student를 생성
    studentMap.put("라이언", new Student(2,"01022222222"));
    studentMap.put("마우스", new Student(3,"01033333333"));
    System.out.println(studentMap.get("라이언").getTel());
  }
  
}
