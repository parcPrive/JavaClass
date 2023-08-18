package converter;


public class WonToEuro extends Converter{

  WonToEuro(double ratio){
    this.ratio = ratio;
  }
  @Override
  public double convert(double src) {
    return src / ratio;
  }

  @Override
  public String srcString() {
   return "원";
  }

  @Override
  public String destString() {
    return "유로";
  }

  public static void main(String[] args) {
    WonToEuro wonToEuro = new WonToEuro(1460);
    wonToEuro.run();
  }
  
}