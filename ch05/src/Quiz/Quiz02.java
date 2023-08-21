package Quiz;

class Circle{
  private int x,y;
  private double radius;

  public Circle(int x, int y, double radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  public String toString(){
    return "circle의 좌표는(" + x + ","+ y +")dlrh 반지름 => " + radius + " 입니다";
  }

  public boolean equals(Object obj){
    Circle circle = (Circle)obj;
    return x == circle.x && y == circle.y ? true : false;
  }
  
}



public class Quiz02 {
  public static void main(String[] args) {
    Circle circle01 = new Circle(3, 4, 10);
    Circle circle02 = new Circle(3, 4, 5);

    System.out.println(circle01.toString()); 
    System.out.println(circle01.equals(circle02));
  }
  
}
