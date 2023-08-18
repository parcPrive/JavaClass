class Mypoint {
  int x;
  int y;
  
  public Mypoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  double getDistance(int x1, int y1){
    double aaa = x1 - this.x;
    double bbb = y1 - this.y;
    if(x1 - this.x < 0){
      aaa = -aaa;
    }
    if(y1 - this.y < 0){
      bbb = -bbb;
    }

    
    return Math.sqrt(aaa + bbb); 
}
}


public class No06 {
  public static void main(String[] args) {
    Mypoint p = new Mypoint(1, 1);
    System.out.println(p.getDistance(2, 2));
  }
  

}