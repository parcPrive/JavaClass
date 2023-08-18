public class No03 {
  public static void main(String[] args) {
    Student student = new Student();
    student.name = "홍길동";
    student.ban = 1;
    student.no = 1;
    student.kor = 100;
    student.eng = 60;
    student.math = 76;

    System.out.println(student.name);
    System.out.println(student.getTotal());
    System.out.println(student.getAverage());
  }
}


class Student{
  public String name;
  public int ban;
  public int no;
  public int kor;
  public int eng;
  public int math;

  public Student() {
  
  }

  String info(){
    return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math;
  }

  int getTotal(){
    return math + kor + eng;
  }
  
  double getAverage(){
    int total = getTotal();
    return total / 3.0;
  }
}
