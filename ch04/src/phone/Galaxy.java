package phone;

public class Galaxy implements PhoneInterface{

  @Override
  public void sendCall() {
   System.out.println("전화를건다.");
  }

  @Override
  public void receiveCall() {
    System.out.println("전화를 받다");
  }

  public void bixby(){
    System.out.println("하이 빅스비");
  }

  public static void main(String[] args) {
    PhoneInterface galaxy = new Galaxy();
    
  }
  
}
