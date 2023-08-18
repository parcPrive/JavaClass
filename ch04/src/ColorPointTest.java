public class ColorPointTest {
  public static void main(String[] args) {
    Point point = new Point();
    point.set(10,20);
    point.showPoint();
    ColorPoint colorPoint = new ColorPoint();

    colorPoint.set(30,  40);
    colorPoint.setColor("blue");
    colorPoint.showColorPoint();
  }
}
