public class Rectangle {
  int width;
  int height;

  //생성자를 여러개 만들 수 있다.
  Rectangle(){

  }

 

  int getArea(){
    return width * height;
  }

  public static void main(String[] args) {
    
    Rectangle aaa = new Rectangle();
    aaa.width = 50;
    aaa.height = 40;
    int aaaArea = aaa.getArea();
    System.out.println("사각형의 면적은" + aaaArea + "입니다.");
  }

  
}
