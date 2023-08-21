class Rect {
  private int width;
  private int height;

  public Rect(int width, int height) {
    this.width = width;
    this.height = height;
  }

  // 사각형의 면적이 같으면 true가 나오게 하자!!
  public boolean equals(Object object){
    
    Rect rect = (Rect)object;
    int rect01 = width * height;
    int rect02 = rect.width * rect.height;
    // if(rect01 ==  rect02) return true;
    //  else return false;
    
    return rect01 == rect02 ? true : false;
  }
}


public class RectTest {
  public static void main(String[] args) {
    Rect rect01 = new Rect(20, 20);
    Rect rect02 = new Rect(10, 40);
    System.out.println(rect01.equals(rect02));
  }
}
