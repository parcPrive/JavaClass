package myCircle;

public class MyCircle {
 private double x;
  private double y;
  private int radius;

  public MyCircle(double x, double y, int radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  void show(){
    System.out.printf("x좌표:%.2f, y:좌표:%.2f, 면적: %.2f",this.x, this.y, getArea());
  }

  double getArea(){
    return this.radius * this.radius * 3.14;
  }
  




  public static void main(String[] args) {
    // MyCircle circle = new MyCircle(5, 4, 20);
    // circle.show();

    MyCircle circles[] = new MyCircle[3];

    // double random = Math.floor((Math.random() + 100) * 3);
    for(int i = 0; i < 3; i++ ){
      double x = Math.floor((Math.random() * 200) + 101);
      double y = Math.floor((Math.random() * 200) + 101);
      int radius = (int)Math.floor((Math.random() * 40) + 10);
      circles[i] = new MyCircle(x, y, radius);
     }
     System.out.println(circles[1].radius);
    int max = 0;
    int index = 0;
     for(int i = 0; i < 3; i++){
      if(circles[i].radius > max){
        max = circles[i].radius;
        index = i;
      }
      System.out.println(i+"번째 원!!!!=>"+circles[i].radius);
     }
     System.out.printf("%d번째 원이 가장 면적이 %d로 크고 그원의 정보 => ",index, max);
     circles[index].show();
  }
}
