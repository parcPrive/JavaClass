package calculator.app;

public class App {
  public static void main(String[] args) {
    SamsungCalculator samsungCalculator = new SamsungCalculator();

    int add = samsungCalculator.add(10, 20);
    System.out.println(add);
  }
}
