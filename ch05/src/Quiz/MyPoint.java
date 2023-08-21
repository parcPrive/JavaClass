package Quiz;


public class MyPoint {
  private int x, y;

  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString(){
    return "x => " + x + " y => " + y;
  }
  
  public boolean equals(Object obj){
    MyPoint point = (MyPoint)obj;
    return x == point.x && y == point.y ? true : false;
  }
 public static void main(String[] args) {
 MyPoint mp01 = new MyPoint(3, 4);
 MyPoint mp02 = new MyPoint(3, 4);
 System.out.println(mp01.toString());
 System.out.println(mp01.equals(mp02));
}
  
}