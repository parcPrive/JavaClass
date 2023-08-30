import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable02 implements Runnable{
  private JLabel timerLabel;
  private boolean isEnd = false;
  
  TimerRunnable02(JLabel timLabel){
    this.timerLabel = timerLabel;
  }
  @Override
  public void run() {
    int num = 0;
    while(true){
      timerLabel.setText(Integer.toString(num));
      num++;
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        
        e.printStackTrace();
        return;
      }
      
    }
    
  }
  public void setTimerLabel(JLabel timerLabel) {
    this.timerLabel = timerLabel;
  }
  public void setEnd(boolean isEnd) {
    this.isEnd = isEnd;
  }
  
}


public class ThreadEnd extends JFrame{
  Thread thread;
      ThreadEnd(){
      this.setTitle("Thread");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
      Container contentPane = this.getContentPane();
      contentPane.setLayout(new FlowLayout());
  
      JLabel timerLabel = new JLabel();
      TimerRunnable02 timerRunnable02 = new TimerRunnable02(timerLabel);
      JButton btn = new JButton("stop");
      btn.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          System.out.println("click");
          timerRunnable02.setEnd((true));
          // thread.interrupt();// Thread에 예외를 줘서 catch에 강제로 들어가게해서 thread를 멈추게한다.
        }
        
      });
      thread = new Thread(timerRunnable02);
      thread.start();
      contentPane.add(timerLabel);
  
      this.setSize(300, 300);
      this.setVisible(true);
  
    }

  
  public static void main(String[] args) {
    new ThreadEnd();

  }
}
