package socergrade;
public class Grade {
  int math;
  int kor;
  int eng;

  int average() {
    return (math + kor+ eng) / 3;
  }
}
