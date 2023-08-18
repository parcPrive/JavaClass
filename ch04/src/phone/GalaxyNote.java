package phone;

public class GalaxyNote implements PhoneInterface, Mp3Interface{
// implements는 다중 상속이 가능하다고해서 다중상속을했다.
  @Override
  public void sendCall() {
    System.out.println("갤럭시 노트로 전화걸다.");
  }

  @Override
  public void receiveCall() {
    System.out.println("갤럭시 노트로 전화를 받다.");
  }

  @Override
  public void play() {
    System.out.println("음악을 재생한다.");
   
  }
  @Override
  public void stop() {
    System.out.println("음악을 정지한다.");
  }
  

  
}
