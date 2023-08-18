public class ColorPoint extends Point {
  private String color;
  
  public void setColor(String color){
    this.color = color;
  }

  public void showColorPoint() {
    showPoint();
    System.out.printf("색상은 %s이다", color);
  }

  // public static void main(String[] args) {
  //   ColorPoint colorPoint = new ColorPoint();
  //   colorPoint.set(30, 40);
  //   colorPoint.setColor("green");

  // }
}
