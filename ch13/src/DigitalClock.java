import java.awt.Container;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

class ClockTxtLabel extends JLabel implements Runnable{
  //Thread가 필요하다 이걸 호출로만으로 실행을 하기 위해
  private Thread thread;
  ClockTxtLabel(){
    setFont(new Font("맑은 고딕", Font.PLAIN, 48));
    thread = new Thread(this);
    thread.start();
    setText(showTimeTxt());
  }

  public String showTimeTxt(){
    Calendar calendar = Calendar.getInstance(); // 싱글턴 패턴
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    int min = calendar.get(Calendar.MINUTE);
    int sec = calendar.get(Calendar.SECOND);
    return hour + ":" + min + ":" + sec;
  }

  @Override
  public void run() {
    while(true){
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      // System.out.println("나는 1초에 한번 출력됩니다.");
      setText(showTimeTxt());
    }
  }


}



public class DigitalClock extends JFrame{
  DigitalClock(){
    this.setTitle("Digital Clock");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.add(new ClockTxtLabel());

    this.setSize(300, 300);
    this.setVisible(true);
  }


  public static void main(String[] args) {
    new DigitalClock();
  }
}
