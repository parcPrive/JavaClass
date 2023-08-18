package calc;

abstract public class Calc {
  public int a,b;

  public void setValue(int a, int b){
    this.a = a;
    this.b = b;
  }
  abstract int calculate();
}
