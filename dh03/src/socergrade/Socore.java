package socergrade;
public class Socore {
  public static void main(String[] args) {
    
    Grade student01 = new Grade();
    student01.eng = 66;
    student01.math = 80;
    student01.kor = 20;

    System.out.println("학생의 수학,영어,국어 점수의 평균 =>" + student01.average());
  }
  
}
