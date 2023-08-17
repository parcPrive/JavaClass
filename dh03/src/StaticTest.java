class Calc{
  static int abs(int a){
    return a > 0 ? a : -a;
  }

  int Max(int a, int b){
    return a > b ? a : b;
  }

  int Min(int a, int b){
    return a > b ? b : a;
  }


}


public class StaticTest {
public static void main(String[] args) {
  
  // Calc calc = new Calc();
  // calc.abs(-10);
  Calc.abs(-10);
  
}
  
}
