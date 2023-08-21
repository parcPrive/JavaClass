class Point {
  private int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString(){ //원래 toString이라는 메서드를 사용하면 Point@251a69d7이라는 Point에 관련된 거라는건 알겠지만 무엇인지는 모를 것이 나오는데 이걸 다시 override(재정의)를 해서 사용할수가있다.
    return "x => " + x + "이고 y => " + y;
  }

  public boolean equals(Object object){
    Point point = (Point)object;
    if(x == point.x && y == point.y) return true;
    else return false;
    
  }
}


public class ObjectPropoertyTest {
  public static void main(String[] args) {
    Point point = new Point(10, 10);
    // Point point1 = point;
    Point point1 = new Point(10, 10);
    System.out.println(point.getClass().getName());
    System.out.println(point.hashCode());
    System.out.println(point1.hashCode());
    System.out.println(point.toString());
    System.out.println(point.equals(point1));
    // System.out.println(point); // to
    // System.out.println(point1);
  }
  
}
