import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

class RandomArcPanel extends JPanel implements Runnable{
  private int x, y;
  Thread thread;
  RandomArcPanel(){
    thread = new Thread(this);
    this.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        thread.start();
      }
    });

  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.fillOval(x, y, 20, 20);
    
  }
  @Override
  public void run() {
    while(true){
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
        x = (int)(Math.random() * this.getWidth());
        y = (int)(Math.random() * this.getHeight());
        repaint();
    }
    
  }
}



public class TeacherArc extends JFrame{
  TeacherArc(){
    this.setTitle("DIGITAL CLOCK");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Container contentPane = this.getContentPane();
    // contentPane.add();
    this.setContentPane(new RandomArcPanel());

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new TeacherArc();
  }
  
}
