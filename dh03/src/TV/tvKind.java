package TV;

public class tvKind {
  public static void main(String[] args) {
    TV samsung = new TV();
    samsung.brand = "삼성";
    samsung.size = 32;
    samsung.year = 2023;
    System.out.println(samsung.size);
    samsung.show();

    TV lg = new TV();
    lg.brand = "LG";
    lg.size = 35;
    lg.year = 2022;
    lg.show();

    
  }
}
