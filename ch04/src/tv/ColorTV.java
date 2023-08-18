package tv;


  public class ColorTV  extends TV{
    private int nColor;
  
    public ColorTV(int size, int nColor) {
      super(size); //TV안에 생성자는 사이즈를 받는 생성자뿐이라 super를 써야한다 만약 TV(){} 추가하면 오류는 사라진다.
      this.nColor = nColor;
      
    }

    
    public int getColor(){
      return nColor;
    }

  
    public void show(){
      System.out.printf("%d인치 TV의 색상은 %d입니다.", getSize(), this.getColor());
    }

    public static void main(String[] args) {
      new ColorTV(64, 256).show();
    }

  
}
  

