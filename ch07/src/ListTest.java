import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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



public class ListTest {

  public static void main(String[] args) {
    
    List<Student> studentList = new ArrayList<>();
    studentList.add( new Student("정현목", "java", "UUID", 3.0));
    studentList.add(new Student("송지오", "javascript", "UUID", 3.0));
    studentList.add(new Student("준지", "python", "UUID", 3.0));
    studentList.add(new Student("비", "c++", "UUID", 3.0));
    studentList.add(new Student("소나기", "c#", "UUID", 3.0));
    
    Iterator<Student> it = studentList.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }

     Scanner scanner = new Scanner(System.in);

    while(true){
      System.out.println("학생이름을 입력하세요.");
      String name = scanner.nextLine();
      if(name.equals("그만")) break;
     for(int i = 0; i < studentList.size(); i++){
      Student student = studentList.get(i);
      if(student.getName().equals(name)){
        System.out.println(student);
      }
     }
    }
  }
}