package converter;


public class WonToDollar extends Converter{
  private int won;
  
  public WonToDollar(int won) {
    this.won = won;
  }

  @Override
  public double convert(double src) {
    return src / won;
  }

  @Override
  public String srcString() {
    return "원";
  }

  @Override
  public String destString() {
    return "달러";
  }
  public static void main(String[] args) {
    
    WonToDollar wonToDollar = new WonToDollar(1380);
    wonToDollar.run();
  }
  
}
