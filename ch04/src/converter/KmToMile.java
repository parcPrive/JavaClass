package converter;

public class KmToMile extends Converter{
  
  KmToMile(double ratio){
    this.ratio = ratio;
  }
  @Override
  public double convert(double src) {
    return src / ratio;
  }

  @Override
  public String srcString() {
   return "km";
  }

  @Override
  public String destString() {
   return "mile";
  }

  public static void main(String[] args) {
    
    KmToMile kmToMile = new KmToMile(1.6);
    kmToMile.run();

  }
  
}
