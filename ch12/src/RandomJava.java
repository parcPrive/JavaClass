import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;

class Thread01 extends JFrame implements Runnable{
  private JLabel label = new JLabel();

  Thread01(JLabel label){
    this.label = label;
  }

  @Override
  public void run() {

    while(true){
      int x = (int) (Math.random() * 301);
      int y = (int) (Math.random() * 301);
      label.setText("java");
      label.setLocation(x, y);
      add(label);
      repaint();
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      
    }
    
  }
}




public class RandomJava extends JFrame{
  Thread thread;
  RandomJava(){
    setTitle("random java");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    Container contentPane = this.getContentPane();
    contentPane.setLayout(null); // null을 넣으면 자유로운 배치가 가능하다.

    JLabel label = new JLabel("");
    Thread01 thread01 = new Thread01(label);
      label.setSize(100, 40);
      contentPane.add(label);

    thread = new Thread(thread01);
    thread.start();




      setSize(300,300);
      setVisible(true);
  }

  public static void main(String[] args) {
    new RandomJava();
  }
}
