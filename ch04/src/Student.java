public class Student extends Person{
  public void set(){
    age = 30;
    height = 100;
    name = "정현목";
    setWeight(74);
  }
  
  public void show(){
    System.out.println(age + " " + height + " " + name + " " + getWeight());
  }

  
}
