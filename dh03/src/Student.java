
public class Student {
  
  private int id;
  private String name;
  private double score;
  private String gender;


  public Student(){

  }

  public Student(int id, String name, double score, String gender){
    this.id = id;
    this.name = name;
    this.score = score;
    this.gender = gender;

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
  
  
}
