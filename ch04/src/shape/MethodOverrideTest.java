package shape;

abstract class Shape{
  abstract public void draw();
  // {
  //   System.out.println("Shape");
  // }
}

class Line extends Shape{

  @Override
  public void draw() {
    System.out.println("Line");
  }
  
}

class Rect{

  public void draw() {
   System.out.println("Rect");
  }
  
}

class Weapon{
  int fire(){
    return 1;
  }
}

class Canon extends Weapon{
  int fire() {
    return 10;
  }
}

public class MethodOverrideTest {
  public static void main(String[] args) {
    // new Line().draw();
    // new Shape().draw();
    // Shape line = new Line();
    // line.draw();
    // new Rect().draw();
    Weapon weapon = new Weapon();
    System.out.printf("기본무기의 파워는 %d", weapon.fire());
    weapon = new Canon();
    System.out.printf("캐논의 파워는 %d", weapon.fire());
  }
}
