package superEx;

public class Point {
  private int x, y;

  // 생성자 함수
  public Point(){

  }

  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  
  public void show(){
    System.out.printf("(%d, %d)", x, y);
  }
  
}
