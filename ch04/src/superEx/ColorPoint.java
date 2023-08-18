package superEx;

public class ColorPoint extends Point {
  private String color;

  ColorPoint(int x, int y, String color) {
    super(x, y);
    this.color  = color;
  }

  void showColorPoint(){
    show();
    System.out.println(color);
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}