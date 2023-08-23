package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student02 {
    private String name, id;
    private double grade;
  }
  



public class Quiz05 {
  public static void main(String[] args) {
    HashMap<String,Double> studentList = new HashMap<>();
    studentList.put("손흥민", 3.8);
    studentList.put("음바페", 3.7);
    studentList.put("오타니", 4.3);
    studentList.put("귀찮아", 3.7);
    studentList.put("졸려", 4.5);
    studentList.put("12시간 자고싶다.", 4.4);

    Set<String> keys = studentList.keySet();
    Iterator<String> it = keys.iterator();

    while(it.hasNext()){
      String name = it.next();
      double score = studentList.get(name);
      if(score >= 3.8){
        System.out.println(name + "장학금 지급");
      }else{
        System.out.println("학점부족");
      }

    }

  }
}
