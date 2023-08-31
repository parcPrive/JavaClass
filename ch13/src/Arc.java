import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;


class ArcPanel extends JPanel implements Runnable{
  private Thread thread;

  ArcPanel(){
    thread = new Thread(this);
    thread.start();
  }

  public void paintArc(int x, int y, Graphics g){
    super.paintComponent(g);
    g.setColor(Color.BLUE);
    g.drawArc(x, y, 100, 100, 0, 360);
  }


  @Override
  public void run() {
    while(true){
      try {
        Thread.sleep(300);
      } catch (InterruptedException e) {
      
        e.printStackTrace();
      }
      int x = (int)(Math.random() * 501);
      int y = (int)(Math.random() * 501);
      paintArc(x, y, getGraphics());
    }
  }
  

}

public class Arc extends JFrame{
  Arc(){
    this.setTitle("ARC");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.add(new ArcPanel());

    this.setSize(500, 500);
    this.setVisible(true);
    
  }
  public static void main(String[] args) {
    new Arc();
  }
}
