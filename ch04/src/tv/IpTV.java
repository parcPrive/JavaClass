
package tv;

public class IpTV extends ColorTV{
  private String ip;

  public IpTV(int size, int nColor, String ip) {
    super(size, nColor);
    this.ip = ip;
  }

  public String getIp() {
    return ip;
  }

  public void show(){
    System.out.printf("%d인치 색상은 %d이고 ip주소는 %s입니다.",getSize(),getColor(),this.getIp());
  }

  public static void main(String[] args) {
    new IpTV(45, 4124, "123.123.123.123").show();;
  }
}