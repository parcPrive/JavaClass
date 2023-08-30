import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



class RandomThread extends JPanel implements Runnable{
  private boolean end = false;

  RandomThread(){
    this.setLayout(null);

  }

  @Override
  public void run() {
    while(true){
      JLabel label = new JLabel("JAVA");
      label.setSize(80, 30);
      int posX = (int)(Math.random() * 301);
      int posY = (int)(Math.random() * 301);
      label.setLocation(posX, posY);
      add(label);
      repaint();
      System.out.println(label.toString());
      try {
        Thread.sleep(300);
        if(end){
          removeAll();
          label = new JLabel("end");
          label.setForeground(Color.RED);
          label.setSize(120, 30);
          label.setLocation(130, 130);
          add(label);
          repaint();
          return;
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
  }

  public boolean isEnd() {
    return end;
  }

  public void setEnd(boolean end) {
    this.end = end;
  }
  
}


public class RandomTxt extends JFrame{
  Thread thread;
  RandomTxt(){
    this.setTitle("Thread");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
      Container contentPane = this.getContentPane();
      contentPane.setLayout(new FlowLayout());

      RandomThread randomThread = new RandomThread();
      randomThread.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          
          randomThread.setEnd(true);
        }
        
      });
      this.setContentPane(randomThread);
      thread = new Thread(randomThread);
      thread.start();
  
      this.setSize(300, 300);
      this.setVisible(true);
  
}

  public static void main(String[] args) {
    new RandomTxt();
  }
  
}
