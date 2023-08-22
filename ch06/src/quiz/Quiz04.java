package quiz;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

import javax.swing.text.html.HTMLDocument.Iterator;

class Student {
  private String name, department, id;
  private double grade;

  public Student(String name, String department, String id, double grade) {
    this.name = name;
    this.department = department;
    this.id = id;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public double getGrade() {
    return grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", department=" + department + ", id=" + id + ", grade=" + grade + "]";
  }
  
}



public class Quiz04 {
  public static void main(String[] args) {
    HashMap<String, Student> studentList = new HashMap<>();
    studentList.put("정현목", new Student("정현목", "java", "UUID", 3.0));
    studentList.put("송지오", new Student("송지오", "javascript", "UUID", 3.0));
    studentList.put("준지", new Student("준지", "python", "UUID", 3.0));
    studentList.put("비", new Student("비", "c++", "UUID", 3.0));
    studentList.put("소나기", new Student("소나기", "c#", "UUID", 3.0));
    
    Set<String> keys = studentList.keySet();
    
    java.util.Iterator<String> it = keys.iterator();
    // while(it.hasNext()){
      // System.out.println(it.next());
    // }
    while(it.hasNext()){
      System.out.println(studentList.get(it.next()).toString());
    }
    Scanner scanner = new Scanner(System.in);

    while(true){
      System.out.println("학생이름을 입력하세요.");
      String name = scanner.nextLine();
      if(name.equals("그만")) break;
      if(studentList.get(name) == null){
        System.out.println("없는사람입니다.");
      }else{
        System.out.println(studentList.get(name).toString());
      }
    }

  }
  
}
